package com.shoppingApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingApp.Entiry.User;
import com.shoppingApp.Service.UserService;

@RestController
@RequestMapping("/api/")
public class UserControler {
	
	@Autowired
	UserService userServic;
	
	@GetMapping("/user")
	public List<User>getUsers()
	{
		return userServic.getUser();
		
	}
	@PostMapping("/user")
	public User addUser(@RequestBody User user)
	{
		return userServic.addUser(user);
		
	}

}
