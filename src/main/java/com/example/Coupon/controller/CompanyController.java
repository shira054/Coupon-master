package com.example.Coupon.controller;

import com.example.Coupon.model.Company;
import com.example.Coupon.model.Coupon;
import com.example.Coupon.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    CompanyService service;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<Company> getCompanies() {
        return service.getCompanies();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("getId/{id}")
    public Company getCompanyById(@PathVariable int id) {
        return service.getCompanyById(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/name/{name}")
    public Company getCompanyByName(@PathVariable String name) {
        return service.getCompanyByName(name);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public void addCompany(@RequestBody Company company) {
        service.addCompany(company);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("del/{id}")
    public void deleteCompany(@PathVariable int id) {
        service.deleteCompany(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/{id}")
    public void updateCompany(@PathVariable int id, @RequestBody Company company) {
        service.updateCompany(id, company);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/{id}")
    public List<Coupon> getCouponsByCompanyId(@PathVariable int company_id) {
      return   service.getCouponsByCompanyId(company_id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/pass/{password}")
    public Company getCompanyByPassword(@PathVariable String password){
        return service.getCompanyByPass(password);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/coupon")
    public void addCoupon(@RequestBody Coupon coupon){service.addCoupon(coupon);}

}
