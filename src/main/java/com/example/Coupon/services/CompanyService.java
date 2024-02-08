package com.example.Coupon.services;

import com.example.Coupon.model.Company;
import com.example.Coupon.model.Coupon;
import com.example.Coupon.repository.CompanyRepository;
import com.example.Coupon.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyService {

    @Autowired
   private CompanyRepository companyRepository;
    @Autowired
    private CouponRepository couponRepository;

    public List<Company> getCompanies()
    {
        return (List<Company>) companyRepository.findAll();
    }

    public Company getCompanyById(long id)
    {
        return companyRepository.findById(id).get();
    }

    public Company getCompanyByName(String name)
    {
        return companyRepository.findByName(name);
    }

    public void addCompany(Company company)
    {
        companyRepository.save(company);
    }

    public void deleteCompany(long id)
    {
        companyRepository.deleteById(id);
    }

    public void updateCompany(long id, Company company)
    {
        // companyRepository.deleteById(id);
        companyRepository.save(company);
    }

    public List<Coupon> getCouponsByCompanyId(long company_id)
    {
        return companyRepository.findById(company_id).get().getCoupons();
    }

    public Company getCompanyByPass(String pass){
        return companyRepository.findByPassword(pass);
    }
    public Coupon findByTitle(String title){return couponRepository.findByTitle(title);}

    public void addCoupon(Coupon coupon){
        Coupon c=findByTitle(coupon.getTitle());//בשביל לבדוק אם קיים
        if(c==null)//רק אם לא קיים מוסיף אותו
            couponRepository.save(coupon);
    }
}
