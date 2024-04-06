package com.shoppingApp.Repositrory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingApp.Entiry.Orders;

public interface OrderRepo extends JpaRepository<Orders, Integer> {

}
