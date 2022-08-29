package benchmark;

import javax.inject.Inject;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

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
