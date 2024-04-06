package com.shoppingApp.Repositrory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingApp.Entiry.Invetory;

public interface InventoryRepo extends JpaRepository<Invetory, Integer>{

}
