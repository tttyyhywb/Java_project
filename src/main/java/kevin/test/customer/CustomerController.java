package kevin.test.customer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerApplication customerApplication;

    public CustomerController(CustomerApplication customerApplication) {
        this.customerApplication = customerApplication;
    }

    @GetMapping("customers/{customerId}")
    public Customer by(@PathVariable CustomerId customerId) {
        return customerApplication.getCustomer(customerId).get();
    }

    @GetMapping("customers")
    public List<Customer> customers(){
        return customerApplication.allCustomers();
    }

    @PostMapping("customers")
    public Customer save(@RequestBody Customer customer){
        return customerApplication.save(customer);
    }

}
