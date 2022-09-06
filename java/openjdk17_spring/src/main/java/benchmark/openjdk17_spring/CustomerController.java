package benchmark.openjdk17_spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> getAllCustomers(){
        return this.customerRepository.findAll();
    }

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody Customer customer){
        this.customerRepository.save(customer);
    }

}
