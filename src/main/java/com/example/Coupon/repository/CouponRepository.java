package com.example.Coupon.repository;

import com.example.Coupon.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long>{
    //Coupon findByCoupon_id(int coupon_id);
    //Coupon findByCompanyId(int companyId);
    Coupon findByTitle(String title);
}

