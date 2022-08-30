package benchmark.webflux;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class Handler {

  private final CustomersRepository customers;

  @GetMapping(value = "", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
  public Flux<Customers> getCustomers() {
    return this.customers.findAll();
  }

  @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
  public Mono<String> send(@RequestBody Customers request) {
    return this.customers.save(request)
            .map(m -> "ok");
  }

  
}
