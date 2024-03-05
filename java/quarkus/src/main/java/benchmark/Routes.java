package benchmark;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/customers")
public class Routes {

    @Inject
    private Handler customerService;

    @GET
    public List<Customers> list() {
        return customerService.list();
    }

    @POST
    public String add(final Customers customer) {
        customerService.add(customer);
        return "ok";
    }
}