package com.houseManagement.virtusa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="housemanagement")
public class House {
	
	@Id
	private int id;
	private int houseId;
	private int houseNo;
	private String status;
	private String type;
	
	public House() {
		super();
		// TODO Auto-generated constructor stub
	}
	public House(int id, int houseId, int houseNo, String status, String type) {
		super();
		this.id = id;
		this.houseId = houseId;
		this.houseNo = houseNo;
		this.status = status;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
