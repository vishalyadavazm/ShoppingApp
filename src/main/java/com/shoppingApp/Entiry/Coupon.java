package com.shoppingApp.Entiry;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Coupon {
	
		@Id
		private String code;
	    private int discountPercentage;
	    
		public Coupon() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Coupon(String code, int discountPercentage) {
			super();
			this.code = code;
			this.discountPercentage = discountPercentage;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public int getDiscountPercentage() {
			return discountPercentage;
		}

		public void setDiscountPercentage(int discountPercentage) {
			this.discountPercentage = discountPercentage;
		}
	    
	    

	}
	


