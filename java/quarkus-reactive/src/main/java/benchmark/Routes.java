package benchmark;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import io.smallrye.mutiny.Uni;

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