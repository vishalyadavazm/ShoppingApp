package com.shoppingApp.Repositrory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingApp.Entiry.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
