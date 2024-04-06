package com.shoppingApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingApp.Entiry.Invetory;
import com.shoppingApp.Service.InventoryService;

@RestController
@RequestMapping("/api/")
public class InventoryController {
	
	@Autowired
	InventoryService inventoryServic;
	
	
	@GetMapping("/inventory")
	public List<Invetory>getAllInventory()
	{
		return inventoryServic.getAllInventory();
		
	}
	
	@PutMapping("/inventory")
	public Invetory addInvetory(@RequestBody Invetory invetory)
	{
		return inventoryServic.addInvetory(invetory);
		
	}

	
	

}
