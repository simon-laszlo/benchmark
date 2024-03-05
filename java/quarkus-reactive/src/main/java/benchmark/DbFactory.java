package benchmark;

import io.quarkus.mongodb.reactive.ReactiveMongoClient;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;

public class DbFactory {

  @Inject
  private ReactiveMongoClient client;

  @Produces
  public Db getDb() {
    return new Db(this.client, "mydb");
  }
  
}
