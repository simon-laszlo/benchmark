package benchmark;

import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Handler {

  @Inject
  private Db db;

  public List<Customers> list() {
    return db.getCollection("customers", Customers.class)
         .find().into(new ArrayList<>());
  }
        

  public void add(final Customers customer) {
    db.getCollection("customers", Customers.class).insertOne(customer);
  }

}
