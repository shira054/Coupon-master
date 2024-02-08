package com.example.Coupon.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
@Entity
public class Customer {
    @Id
    private int customer_id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @OneToMany(cascade = CascadeType.REMOVE)
    private List<Coupon> coupons;

    public Customer() {
    }

    public String toString() {
        return "Customer{customer_id=" + this.customer_id + ", firstName='" + this.firstName + "', lastName='" + this.lastName + "', email='" + this.email + "', password='" + this.password + "', coupons=" + this.coupons + "}";
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCoupons(List<Coupon> coupons) {
        this.coupons = coupons;
    }

    public int getCustomer_id() {
        return this.customer_id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public List<Coupon> getCoupons() {
        return this.coupons;
    }

    public Customer(int customer_id, String firstName, String lastName, String email, String password, List<Coupon> coupons) {
        this.customer_id = customer_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.coupons = coupons;
    }
}
