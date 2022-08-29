package benchmark;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.mongodb.client.MongoCursor;

@ApplicationScoped
public class Handler {

  @Inject
  private Db db;

  public List<Customers> list() {
    final List<Customers> list = new ArrayList<>();
    final MongoCursor<Customers> cursor = db.getCollection("customers", Customers.class).find().iterator();

    try {
      while (cursor.hasNext()) {
        final Customers customer = cursor.next();
        list.add(customer);
      }
    } finally {
      cursor.close();
    }
    return list;
  }

  public void add(final Customers customer) {
    db.getCollection("customers", Customers.class).insertOne(customer);
  }

}
