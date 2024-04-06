package com.shoppingApp.Repositrory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingApp.Entiry.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, String> {

}
