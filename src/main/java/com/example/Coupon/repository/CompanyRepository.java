package com.example.Coupon.repository;

import com.example.Coupon.model.Company;
import com.example.Coupon.model.Coupon;
import com.example.Coupon.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    // בשכבה זו יוצרים ממשק למודלים הרלוונטים  לא חייב באמת לממש את השכבה הזאת כי היא אוטומטי מספקת לנו פונקציות קיימות
    //לדוג פונקציה שמחזירה את ה-id
    // Company findByCompany_id(int company_id);//קיים
    // List<Coupon> getCoupons(int company_id);
    //Company findById(int company_id);

    Company findByName(String name);
   Company findByPassword (String password);
}
