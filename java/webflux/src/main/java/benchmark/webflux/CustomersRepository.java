package benchmark.webflux;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

interface CustomersRepository extends ReactiveMongoRepository<Customers, String> {

}