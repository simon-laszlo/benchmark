package benchmark.webflux;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("customers")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customers {
    private String guid;
    @BsonProperty("first_name")
    private String firstName;
    @BsonProperty("last_name")
    private String lastName;
    @BsonProperty("first_name")
    private String email;
    private String address;

}
