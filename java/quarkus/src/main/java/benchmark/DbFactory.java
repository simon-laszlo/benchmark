package benchmark;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import com.mongodb.client.MongoClient;

public class DbFactory {

  @Inject
  private MongoClient client;

  @Produces
  public Db getDb() {
    return new Db(this.client, "mydb");
  }
  
}
