package com.shoppingApp.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingApp.Entiry.Invetory;
import com.shoppingApp.Repositrory.InventoryRepo;
import com.shoppingApp.Service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService{

	@Autowired
	InventoryRepo inventoryRepo;
	
	@Override
	public List<Invetory> getAllInventory() {
		
		return inventoryRepo.findAll();
	}

	@Override
	public Invetory addInvetory(Invetory invetory) {
		inventoryRepo.save(invetory);
		return invetory;
	}

}
