package com.shoppingApp.Entiry;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity

public class User {
	@Id
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "userName")
	private String username;
	
	@Column(name = "userEmail")
	private String email;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String username, String email) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
