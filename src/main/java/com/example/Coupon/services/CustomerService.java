package com.example.Coupon.services;

import com.example.Coupon.model.Customer;
import com.example.Coupon.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomers()
    {
        return (List<Customer>) customerRepository.findAll();
    }

    public Customer getCustomerById(long id)
    {
        return customerRepository.findById(id).get();
    }
    public Customer getCustomerByName(String firstName) {
        return customerRepository.findByFirstName(firstName);
    }

    public void addCustomer(Customer customer)
    {
        customerRepository.save(customer);
    }

    public void deleteCustomer(long id)
    {
        customerRepository.deleteById(id);
    }

    public void updateCustomer(long id, Customer customer)
    {
        //customerRepository.deleteById(id);
        customerRepository.save(customer);
    }

    public Customer findByEmail(String email){return customerRepository.findByEmail(email);}

}
