package com.example.Coupon.controller;

import com.example.Coupon.model.Company;
import com.example.Coupon.services.AdministratorService;
import com.example.Coupon.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdministratorController {
    //בשכבה זו היא בעצם השכבה שאיתה מתקשרים חיצונית לקליינט או פוסטמן או לדף כרום וע"י שכבה זו מפעילים את הפונקציות שבשכבת הלוגיקה-service
    @Autowired
    AdministratorService service;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<Company> getCompanies() {
        return service.getCompanies();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public void addCompany(@RequestBody Company company) {
        service.addCompany(company);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/{id}")
    public void deleteCompany(@PathVariable int id) {
        service.deleteCompany(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("pass/{password}")
    public void delCustomerByPass(@PathVariable String password){service.delCustomerByPass(password);}

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping
    public void deleteCouponsByCompany(@RequestBody Company company){
        service.deleteCouponsByCompany(company);
    }

}


