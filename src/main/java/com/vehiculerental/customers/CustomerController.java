package com.vehiculerental.customers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
public class CustomerController {
    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers")
    public Iterable<Customer> customersList() {
        return customerRepository.findAll();
    }

    @GetMapping("/customers/{id}")
    public Customer customerShow(@PathVariable int id) {
        return customerRepository.findById(id);
    }

    @PostMapping("/customers")
    public ResponseEntity<Void> customerCreate(@RequestBody Customer inputCustomer) {
        Customer customer = customerRepository.save(inputCustomer);

        if (customer == null) {
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(customer.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @PutMapping("/customers")
    public ResponseEntity<Void> customerUpdate(@RequestBody Customer customer) {
        customerRepository.save(customer);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/customers/{id}")
    public ResponseEntity<Void> customerDelete(@PathVariable int id) {
        Customer customer = customerRepository.findById(id);
        customerRepository.delete(customer);

        return ResponseEntity.noContent().build();
    }
}
