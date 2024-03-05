package benchmark;

import io.quarkus.mongodb.reactive.ReactiveMongoClient;
import io.quarkus.mongodb.reactive.ReactiveMongoCollection;
import io.quarkus.mongodb.reactive.ReactiveMongoDatabase;

public class Db {

  private final ReactiveMongoDatabase db;

  public Db(final ReactiveMongoClient mongoClient, final String db) {
    this.db = mongoClient.getDatabase(db);
  }
  
  public <T> ReactiveMongoCollection<T> getCollection(String collection, Class<T> clazz) {
    return db.getCollection(collection, clazz);
  }
  
}
