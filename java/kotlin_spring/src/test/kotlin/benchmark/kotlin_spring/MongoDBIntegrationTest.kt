package benchmark.kotlin_spring

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest
import org.springframework.test.context.ContextConfiguration

@ContextConfiguration(classes = [KotlinSpringApplication::class])
@DataMongoTest
class MongoDBIntegrationTest {

    private val GUID = "1111"
    private val FIRSTNAME = "TestFirstName"
    private val LASTNAME = "TestLastName"
    private val EMAIL = "TestEmail"
    private val ADDRESS = "TestAddress"

    @Test
    fun saveRetrieveTest(@Autowired mongoRepository: CustomerRepository) {
        val savedCustomer = Customer(GUID, FIRSTNAME, LASTNAME, EMAIL, ADDRESS)
        mongoRepository.save(savedCustomer)
        val loadedCustomer = mongoRepository.findByGuid(GUID)
        assertNotNull(loadedCustomer)
        assertEquals(GUID, loadedCustomer!!.guid)
        assertEquals(FIRSTNAME, loadedCustomer!!.first_name)
        assertEquals(LASTNAME, loadedCustomer!!.last_name)
        assertEquals(EMAIL, loadedCustomer!!.email)
        assertEquals(ADDRESS, loadedCustomer!!.address)
    }
}