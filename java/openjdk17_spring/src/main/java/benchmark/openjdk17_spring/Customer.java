package benchmark.openjdk17_spring;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("customers")
public record Customer(
        String guid,
        @BsonProperty("first_name")
        String firstName,
        @BsonProperty("last_name")
        String lastName,
        String email,
        String address
){}