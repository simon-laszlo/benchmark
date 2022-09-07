package benchmark.openjdk17_spring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ContextConfiguration(classes = Openjdk17SpringApplication.class)
@DataMongoTest
public class MongoDbIntegrationTest {

    private final String GUID = "1111";
    private final String FIRSTNAME = "TestFirstName";
    private final String LASTNAME = "TestLastName";
    private final String EMAIL = "TestEmail";
    private final String ADDRESS = "TestAddress";

    @Test
    public void saveRetrieveTest(@Autowired CustomerRepository mongoRepository) {

        Customer savedCustomer = new Customer(GUID, FIRSTNAME, LASTNAME, EMAIL, ADDRESS);
        mongoRepository.save(savedCustomer);
        Customer loadedCustomer = mongoRepository.findByGuid(GUID);

        assertNotNull(loadedCustomer);
        assertEquals(GUID, loadedCustomer.guid());
        assertEquals(FIRSTNAME, loadedCustomer.first_name());
        assertEquals(LASTNAME, loadedCustomer.last_name());
        assertEquals(EMAIL, loadedCustomer.email());
        assertEquals(ADDRESS, loadedCustomer.address());

    }
}
