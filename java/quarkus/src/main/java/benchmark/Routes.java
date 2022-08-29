package benchmark;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

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