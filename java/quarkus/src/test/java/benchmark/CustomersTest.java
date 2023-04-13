package benchmark;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

@QuarkusTest
public class CustomersTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/customers")
          .then()
             .statusCode(200)
             //FIXME validation
             .body(containsString("first_name"));
    }

}