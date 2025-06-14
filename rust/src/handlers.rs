use std::convert::Infallible;
use std::sync::Arc;

use crate::models::Customer;
use futures::stream::TryStreamExt;
use mongodb::bson::doc;
use mongodb::{options::FindOptions, Database as Db};
use warp::{self, http::StatusCode};

pub async fn list_customers(db: Arc<Db>) -> Result<impl warp::Reply, Infallible> {
  let typed_collection = db.collection::<Customer>("customers");
  let find_options = FindOptions::builder().build();
  let customers: Vec<Customer> = typed_collection
        .find(doc! {}, find_options)
        .await
        .unwrap()
        .try_collect()
        .await
        .unwrap();

  Ok(warp::reply::json(&customers))
}

/// Creates a new customer
///
/// Adds a new customer object to the data store 
///
/// # Arguments
///
/// * `new_customer` - `Customer` type
/// * `db` - `Db` -> mongo db
pub async fn create_customer(
  new_customer: Customer,
  db: Arc<Db>,
) -> Result<impl warp::Reply, Infallible> {
  let typed_collection = db.collection::<Customer>("customers");

  typed_collection
    .insert_one(new_customer, None)
    .await
    .unwrap();

  Ok(warp::reply::html("Ok"))
}

/// Gets a single customer from the data store
///
/// Returns a JSON object of an existing customer. If the customer
/// is not found, it returns a NOT FOUND status code.
/// # Arguments
///
/// * `guid` - String -> the id of the customer to retrieve
/// * `db` - `Db` -> the thread safe data store
pub async fn get_customer(guid: String, db: Arc<Db>) -> Result<Box<dyn warp::Reply>, Infallible> {
  let typed_collection = db.collection::<Customer>("customers");
  let filter = doc! { "guid": guid };
  let find_options = FindOptions::builder().build();
  let mut cursor = typed_collection.find(filter, find_options).await.unwrap();

  while let Some(customer) = cursor.try_next().await.unwrap() {
    return Ok(Box::new(warp::reply::json(&customer)));
  }
  Ok(Box::new(StatusCode::NOT_FOUND))
}

/// Updates an existing customer
///
/// Overwrites an existing customer in the data store and returns
/// an OK status code. If the customer is not found, a NOT FOUND status
/// code is returned.
///
/// # Arguments
///
/// * `updated_customer` - `Customer` -> updated customer info
/// * `db` - `Db` -> thread safe data store
pub async fn update_customer(
  guid: String,
  updated_customer: Customer,
  db: Arc<Db>,
) -> Result<impl warp::Reply, Infallible> {
  let typed_collection = db.collection::<Customer>("customers");
  let filter = doc! { "guid": guid };
  let update = doc! {"$set": {"first_name": updated_customer.first_name, "last_name": updated_customer.last_name, "address": updated_customer.address, "email": updated_customer.email}};

  match typed_collection.update_one(filter, update, None).await {
    Ok(_result) => Ok(StatusCode::OK),
    Err(_err) => Ok(StatusCode::NOT_FOUND),
  }
}

/// Deletes a customer from the data store
///
/// If the customer exists in the data store, the customer is
/// removed and a NO CONTENT status code is returned. If the customer
/// does not exist, a NOT FOUND status code is returned.
///
/// # Arguments
///
/// * `guid` - String -> the id of the customer to delete
/// * `db` - `Db` -> thread safe data store
pub async fn delete_customer(guid: String, db: Arc<Db>) -> Result<impl warp::Reply, Infallible> {

  let typed_collection = db.collection::<Customer>("customers");
  let filter = doc! { "guid": guid };

  match typed_collection.delete_one(filter, None).await {
    Ok(_result) => Ok(StatusCode::NO_CONTENT),
    Err(_err) => Ok(StatusCode::NOT_FOUND),
  }

}
