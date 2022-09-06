package benchmark.kotlin_spring

import org.slf4j.LoggerFactory
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customers")
class CustomerController(val customerRepository: CustomerRepository) {

    private val LOG = LoggerFactory.getLogger(javaClass)

    @GetMapping(value = [""], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getAllCustomers() : List<Customer> = customerRepository.findAll()

    @PostMapping(value = [""], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun save(@RequestBody customer: Customer){
        customerRepository.save(customer)
    }

}