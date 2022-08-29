package benchmark;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class Handler {

  @Inject
  private Db db;

  public Uni<List<Customers>> list() {
    return db.getCollection("customers", Customers.class).find().collect().asList();
  }

  public Uni<String> add(final Customers customer) {
    return db.getCollection("customers", Customers.class).insertOne(customer).onItem().ignore().andSwitchTo(Uni.createFrom().item("ok"));
  }

}
