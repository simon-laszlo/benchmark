package benchmark.kotlin_spring

import org.bson.codecs.pojo.annotations.BsonProperty
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("customers")
data class Customer(

        val guid: String?,
        @BsonProperty("first_name")
        val firstName: String?,
        @BsonProperty("last_name")
        val lastName: String?,
        val email: String?,
        val address: String?
)