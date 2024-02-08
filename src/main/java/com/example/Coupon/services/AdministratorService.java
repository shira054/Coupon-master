package com.example.Coupon.services;

import com.example.Coupon.model.Company;
import com.example.Coupon.model.Coupon;
import com.example.Coupon.model.Customer;
import com.example.Coupon.repository.CompanyRepository;
import com.example.Coupon.repository.CustomerRepository;
import com.example.Coupon.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorService {
    //בשכבה זו כותבים את הפונקציות הלוגיות בעצם את המימוש של הפונקציות שאנו צריכות
    //זה לדוג הפעולות שהמנהל עושה
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private CouponRepository couponRepository;

    public void deleteCoupon(long id)
    {
        couponRepository.deleteById(id);
    }
    public List<Coupon> getCoupons()
    {
        return (List<Coupon>) couponRepository.findAll();
    }
    public void addCompany(Company company)
    {
        companyRepository.save(company);
    }

    public void deleteCompany(long id)
    {
        companyRepository.deleteById(id);
    }

    public void addCustomer(Customer customer)
    {
        customerRepository.save(customer);
    }

    public void deleteCustomer(long id)
    {
        customerRepository.deleteById(id);
    }

    public List<Company> getCompanies()
    {
        return (List<Company>) companyRepository.findAll();
    }

    public List<Customer> getCustomers()
    {
        return (List<Customer>) customerRepository.findAll();
    }

    public void delCustomerByPass(String password)
    {
        Customer customer = customerRepository.findByPassword(password);
        customerRepository.delete(customer);
    }

    public void deleteCouponsByCompany(Company company){
        long id = company.getCompany_id();
        couponRepository.deleteById(id);
    }
}
