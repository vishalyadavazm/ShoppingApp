package com.shoppingApp.Entiry;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Invetory {
    
	@Id
	private int Oarder;
	public int price;
	private int available;
	
	
	public Invetory() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Invetory(int order, int price, int available) {
		super();
		this.Oarder = order;
		this.price = price;
		this.available = available;
	}


	public int getOrder() {
		return Oarder;
	}


	public void setOrder(int order) {
		this.Oarder = order;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getAvailable() {
		return available;
	}


	public void setAvailable(int available) {
		this.available = available;
	}
	
	
	
	
	
}
