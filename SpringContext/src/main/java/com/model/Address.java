package com.model;

public class Address {
	
	private String street;
	
	private String zipcode;

	public Address(String street, String zipcode) {
		super();
		this.street = street;
		this.zipcode = zipcode;
	}

	public Address() {
		super();
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", zipcode=" + zipcode + "]";
	}
	
}
