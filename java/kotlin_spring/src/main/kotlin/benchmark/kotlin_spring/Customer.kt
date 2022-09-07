package benchmark.kotlin_spring

import org.springframework.data.mongodb.core.mapping.Document

@Document("customers")
data class Customer(
        val guid: String?,
        var first_name: String?,
        var last_name: String?,
        val email: String?,
        val address: String?
)