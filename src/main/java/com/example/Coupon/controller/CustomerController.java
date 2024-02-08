package com.example.Coupon.controller;

import com.example.Coupon.model.Customer;
import com.example.Coupon.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService service;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<Customer> getCustomers() {return service.getCustomers();}

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {return service.getCustomerById(id);}

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/name/{name}")
    public Customer getCustomerByName(@PathVariable String name) {
        return service.getCustomerByName(name);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public void addCustomer(@RequestBody Customer customer) {
        service.addCustomer(customer);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable int id) {
        service.deleteCustomer(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/{id}")
    public void updateCustomer(@PathVariable int id, @RequestBody Customer customer) {
        service.updateCustomer(id, customer);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("email/{email}")
    public Customer findByEmail(@PathVariable String email){return service.findByEmail(email);}


}
