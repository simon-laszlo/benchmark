use core::future::Future;
use std::convert::Infallible;
use warp::Filter;
use mongodb::Database as Db;

use crate::handlers;
use crate::models::Customer;

/// All customer routes
pub async fn customer_routes(
    db: impl Future<Output = Db>,
) -> impl Filter<Extract = impl warp::Reply, Error = warp::Rejection> + Clone {
    let db_inst = db.await;
    let routes = get_customer(db_inst.clone())
        .or(update_customer(db_inst.clone()))
        .or(delete_customer(db_inst.clone()))
        .or(create_customer(db_inst.clone()))
        .or(customers_list(db_inst.clone()));
    routes
}

/// GET /customers
fn customers_list(
    db: Db,
) -> impl Filter<Extract = impl warp::Reply, Error = warp::Rejection> + Clone {
    warp::path("customers")
        .and(warp::get())
        .and(with_db(db))
        .and_then(handlers::list_customers)
}

/// POST /customers
fn create_customer(
    db: Db,
) -> impl Filter<Extract = impl warp::Reply, Error = warp::Rejection> + Clone {
    warp::path("customers")
        .and(warp::post())
        .and(json_body())
        .and(with_db(db))
        .and_then(handlers::create_customer)
}

/// GET /customers/{guid}
fn get_customer(
    db: Db,
) -> impl Filter<Extract = impl warp::Reply, Error = warp::Rejection> + Clone {
    warp::path!("customers" / String)
        .and(warp::get())
        .and(with_db(db))
        .and_then(handlers::get_customer)
}

/// PUT /customers/{guid}
fn update_customer(
    db: Db,
) -> impl Filter<Extract = impl warp::Reply, Error = warp::Rejection> + Clone {
    warp::path!("customers" / String)
        .and(warp::put())
        .and(json_body())
        .and(with_db(db))
        .and_then(handlers::update_customer)
}

/// DELETE /customers/{guid}
fn delete_customer(
    db: Db
) -> impl Filter<Extract = impl warp::Reply, Error = warp::Rejection> + Clone {
    warp::path!("customers" / String)
        .and(warp::delete())
        .and(with_db(db))
        .and_then(handlers::delete_customer)
}

fn with_db(db: Db) -> impl Filter<Extract = (Db,), Error = Infallible> + Clone {
    warp::any().map(move || db.clone())
}

fn json_body() -> impl Filter<Extract = (Customer,), Error = warp::Rejection> + Clone {
    warp::body::content_length_limit(1024 * 256).and(warp::body::json())
}