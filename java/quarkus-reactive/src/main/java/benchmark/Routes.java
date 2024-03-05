package benchmark;

import java.util.List;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/customers")
public class Routes {

    @Inject
    private Handler customerService;

    @GET
    public Uni<List<Customers>> list() {
        return customerService.list();
    }

    @POST
    public Uni<String> add(final Customers customer) {
        return customerService.add(customer);
    }
}