package com.shoppingApp.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingApp.Entiry.Coupon;
import com.shoppingApp.Repositrory.CouponRepo;
import com.shoppingApp.Service.CouponService;

@Service
public class CouponServiceImpl implements CouponService{
  
	@Autowired
	CouponRepo couponRepo;
	 
	@Override
	public List<Coupon> getAllCoupon() {
		// TODO Auto-generated method stub
		return couponRepo.findAll();
	}

	@Override
	public Coupon addCoupon(Coupon coupon) {
		couponRepo.save(coupon);
		return coupon;
	}

}
