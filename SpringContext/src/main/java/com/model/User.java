package com.model;

public class User {
	
	int userId;
	
	String name;
	
	Address address;
	
	public User() {
		
	}
	
	public User(int userId, String name, Address address) {
		super();
		this.userId = userId;
		this.name = name;
		this.address = address;
	}

	public User(String name) {
		super();
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress2(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
