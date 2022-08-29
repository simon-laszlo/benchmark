package benchmark;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Db {

  private final MongoDatabase db;

  public Db(final MongoClient mongoClient, final String db) {
    this.db = mongoClient.getDatabase(db);
  }
  
  public <T> MongoCollection<T> getCollection(String collection, Class<T> clazz) {
    return db.getCollection(collection, clazz);
  }
  
}
