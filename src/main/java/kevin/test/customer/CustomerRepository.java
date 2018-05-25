package kevin.test.customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByFirstName(String firstName);

    public Optional<Customer> findById(String id);

    public List<Customer> findByLastName(String lastName);

}
