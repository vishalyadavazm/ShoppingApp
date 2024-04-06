package com.shoppingApp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shoppingApp.Entiry.Invetory;

@Service
public interface InventoryService {
	
	public List<Invetory>getAllInventory();
	
	public Invetory addInvetory(Invetory invetory);

}
