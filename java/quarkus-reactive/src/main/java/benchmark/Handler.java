package benchmark;

import java.util.List;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

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
