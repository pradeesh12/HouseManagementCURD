package com.houseManagement.virtusa.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.houseManagement.virtusa.model.House;
import com.houseManagement.virtusa.service.HouseManagementService;

@RestController
public class HouseManagementController 
{
	private HouseManagementService call;

	public HouseManagementController(HouseManagementService call) {
		super();
		this.call = call;
	}
	@PostMapping("/saveHouse")
	public ResponseEntity<House> saveCar(@RequestBody House house)
	{
		return new ResponseEntity<House>(call.saveHouse(house),HttpStatus.CREATED);
	}


	@GetMapping("/getAllHouse")
	public List<House> getAllHouse()
	{
		return call.getAllHouse();
	}
	
	@DeleteMapping("/deleteHouse/{id}")
	public ResponseEntity<String> deleteHouse(@PathVariable("id") int id)
	{
	     call.deleteHouse(id);
		return new ResponseEntity<String>("Car deleted successfully",HttpStatus.OK);
	} 
	@GetMapping("/getHouseById/{id}")
	public ResponseEntity<House> getCarById(@PathVariable("id") int id)
	{
		return new ResponseEntity<House>(call.getHouseById(id),HttpStatus.OK);
	}
	
}
