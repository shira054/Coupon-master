package com.example.Coupon.repository;

import com.example.Coupon.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByPassword(String password);
    Customer findByFirstName(String firstName);
    Customer findByEmail(String email);
}
