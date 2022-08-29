package benchmark;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import com.mongodb.client.MongoClient;

import io.quarkus.mongodb.reactive.ReactiveMongoClient;

public class DbFactory {

  @Inject
  private ReactiveMongoClient client;

  @Produces
  public Db getDb() {
    return new Db(this.client, "mydb");
  }
  
}
