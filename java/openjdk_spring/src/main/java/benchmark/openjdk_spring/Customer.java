package benchmark.openjdk_spring;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("customers")
public record Customer(
        String guid,
        String first_name,
        String last_name,
        String email,
        String address
){}