package kevin.test.cutomer;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping("customers")
    public void save(@RequestBody Customer customer){
        customerApplication.save(customer);
    }

}
