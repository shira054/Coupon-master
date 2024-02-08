package com.example.Coupon.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
@Entity
public class Company {
    @Id
    private int company_id;
    private String name;
    private String email;
    private String password;
    @OneToMany(cascade = CascadeType.REMOVE)
    private List<Coupon> coupons;

    public int getCompany_id() {
        return this.company_id;
    }

    public String toString() {
        return "Company{company_id=" + this.company_id + ", name='" + this.name + "', email='" + this.email + "', password='" + this.password + "', coupons=" + this.coupons + "}";
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getName() {
        return this.name;
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

    public Company(int company_id, String name, String email, String password, List<Coupon> coupons) {
        this.company_id = company_id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.coupons = coupons;
    }

    public Company() {
    }
}
