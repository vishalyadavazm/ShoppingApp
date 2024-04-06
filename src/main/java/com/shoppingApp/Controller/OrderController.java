package com.shoppingApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingApp.Entiry.Orders;


@RestController
@RequestMapping("/api")
public class OrderController {
	
	
	
	 @PostMapping("/{userId}/order")
	    public ResponseEntity<Orders> placeOrder(@PathVariable int userId,
	                                                    @RequestBody int quantity,
	                                                    @RequestBody String coupon) {
	        return null;
	    }

}
