package com.shoppingApp.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.shoppingApp.Entiry.Orders;

public interface OrderService {

	public ResponseEntity<Orders> placeOrder(int userId, int quantity, String coupon);

}
