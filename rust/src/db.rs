use mongodb::{Client, options::ClientOptions, Database};
use core::future::Future;

pub fn init_db() -> impl Future<Output = Database> {
  async {
    let client_options = ClientOptions::parse("mongodb://localhost:27017").await.unwrap();
    let client = Client::with_options(client_options).unwrap();
    let db = client.database("mydb");
    db
  }
}