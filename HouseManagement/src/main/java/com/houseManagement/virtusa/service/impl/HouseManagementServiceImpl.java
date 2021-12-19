package com.houseManagement.virtusa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.houseManagement.virtusa.model.House;
import com.houseManagement.virtusa.repository.HouseManagementRepository;
import com.houseManagement.virtusa.service.HouseManagementService;

@Service
public class HouseManagementServiceImpl implements HouseManagementService{

	private HouseManagementRepository repo;
	public HouseManagementServiceImpl(HouseManagementRepository repo) {
		super();
		this.repo = repo;
	}
	@Override
	public List<House> getAllHouse() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public House saveHouse(House h) {
		return repo.save(h);
	}
	
	
	public void deleteHouse(int id) {
		// TODO Auto-generated method stub
		Optional<House> find=repo.findById(id);
		if(find.isPresent())
		{
			repo.deleteById(id);
		}
		else
		{
			System.out.print("not found");
		}		
	}
	
	public House getHouseById(int id) {
		Optional<House> find=repo.findById(id);
		if(find.isPresent())
		{
			return find.get();
		}
		else
		{
			System.out.print("not found");
			return null;
		}		
	}
}
