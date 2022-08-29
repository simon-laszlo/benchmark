package benchmark;

import org.bson.codecs.pojo.annotations.BsonProperty;

public record Customers(String guid, @BsonProperty(value = "first_name") String firstName, @BsonProperty(value = "lastName") String lastName, String email, String address) {
  
}
