package benchmark;

import com.mongodb.client.MongoClient;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;

public class DbFactory {

  @Inject
  private MongoClient client;

  @Produces
  public Db getDb() {
    return new Db(this.client, "mydb");
  }
  
}
