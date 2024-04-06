package com.shoppingApp.Service;

import java.util.List;



import com.shoppingApp.Entiry.User;

public interface UserService {
	
	//getuser
	public List<User>getUser();
	//create user
	public User addUser( User user);
	

}
