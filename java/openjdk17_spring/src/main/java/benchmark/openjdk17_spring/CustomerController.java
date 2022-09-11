package benchmark.openjdk17_spring;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @GetMapping(value = "", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public List<Customer> getAllCustomers(final HttpServletResponse response){
        return this.customerRepository.findAll();
    }

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String save(@RequestBody Customer customer){
        this.customerRepository.save(customer);
        return "ok";
    }

}
