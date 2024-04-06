package com.shoppingApp.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.shoppingApp.Entiry.Invetory;
import com.shoppingApp.Entiry.Orders;
import com.shoppingApp.Repositrory.OrderRepo;
import com.shoppingApp.Service.OrderService;
@Service
public  class OrderServicImpl implements OrderService {
	
	@Autowired
	OrderRepo orderRepo;
	
	

	
	
   
	@Override
	public ResponseEntity<Orders> placeOrder(int userId, int quantity, String coupon) {
		
		Invetory inventory =new Invetory();
	   Orders order =new Orders();
	   double total=0;
	    int price=100;
        String coupon1="OFF5";
        String coupon2="OFF10";
		if(coupon.equals(coupon1))
		{
			int amount=price*quantity;
			 total=(long) (amount*0.05);
		}
		else {
			int amount=price*quantity;
			 total=(long) (amount*0.10);
		}
		
		order.setUserId(userId);
		order.setQuantity(quantity);
		order.setCoupon(coupon);
		order.setAmount(total);
		inventory.setOrder(quantity);
		int available=inventory.getAvailable();
		int av=available-quantity;
		inventory.setAvailable(av);
		orderRepo.save(order);
		
		
		return null;
	}

}
