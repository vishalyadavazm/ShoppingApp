package com.shoppingApp.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingApp.Entiry.User;
import com.shoppingApp.Repositrory.UserRepo;
import com.shoppingApp.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public List<User> getUser() {
		
		return userRepo.findAll();
	}

	@Override
	public User addUser(User user) {
		userRepo.save(user);
		return user;
	}
	


}
