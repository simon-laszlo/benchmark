package benchmark.kotlin_spring

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository  : MongoRepository<Customer, String> {
}

