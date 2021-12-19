package com.houseManagement.virtusa.service;

import java.util.List;

import com.houseManagement.virtusa.model.House;

public interface HouseManagementService {
	
		House saveHouse(House h);
		List<House> getAllHouse(); 
		void deleteHouse(int id);
		House getHouseById(int id);
}
