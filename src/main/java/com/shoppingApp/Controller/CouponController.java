package com.shoppingApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingApp.Entiry.Coupon;
import com.shoppingApp.Service.CouponService;
@RestController
@RequestMapping("/api/")
public class CouponController {
	
	
	@Autowired
	CouponService couponService;
	
	
	@GetMapping("/fetchCoupons")
	public List<Coupon>getAllcoupon()
	{
		return couponService.getAllCoupon();
		
	}
	
	@PostMapping("/addCoupons")
	public Coupon addCoupon(@RequestBody Coupon coupon) {
		return couponService.addCoupon(coupon);
		
	}

}
