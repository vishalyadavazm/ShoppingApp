package com.shoppingApp.Entiry;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int OrderId;
	public int quantity;
	private double amount;
	//@OneToMany(mappedBy = "user_id")
	public int userId;
	private String coupon;
	
	
	public Orders(int orderId, int quantity, double amount, int userId, String coupon) {
		super();
		OrderId = orderId;
		this.quantity = quantity;
		this.amount = amount;
		this.userId = userId;
		this.coupon = coupon;
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getAmount() {
		return amount;
	}





	public void setAmount(double amount) {
		this.amount = amount;
	}


	public int getOrderId() {
		return OrderId;
	}


	public void setOrderId(int orderId) {
		OrderId = orderId;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getCoupon() {
		return coupon;
	}


	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	

}
