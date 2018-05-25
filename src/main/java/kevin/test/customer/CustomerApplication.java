package kevin.test.customer;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomerApplication {

    private CustomerRepository customerRepository;

    public CustomerApplication(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Optional<Customer> getCustomer(CustomerId id) {
        return customerRepository.findById(id.getId());
    }

    public void save(Customer customer) {
        customerRepository.insert(customer);
    }
}
