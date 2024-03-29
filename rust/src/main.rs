use warp;

mod db;
mod handlers;
mod models;
mod routes;

#[tokio::main]
async fn main() {
    let db = db::init_db();
    let customer_routes = routes::customer_routes(db).await;

    warp::serve(customer_routes)
        .run(([0, 0, 0, 0], 8080))
        .await;
}
