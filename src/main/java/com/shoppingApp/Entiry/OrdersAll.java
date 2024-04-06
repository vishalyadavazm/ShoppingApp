package com.shoppingApp.Entiry;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public class OrdersAll {
	
	@Id
	public int orderID;
	public int amount;
	public Date date;
	public String coupon;
	public int transactionId;
	public OrdersAll() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrdersAll(int orderID, int amount, Date date, String coupon, int transactionId) {
		super();
		this.orderID = orderID;
		this.amount = amount;
		this.date = date;
		this.coupon = coupon;
		this.transactionId = transactionId;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCoupon() {
		return coupon;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	

}
