package com.cms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Entity
public class Address {
	
	@Id
	private int addressId;
	@NotEmpty
	@Pattern(regexp = "^[A-Za-z ]+$", message="Enter State Name in Alphabets")
	private String state;
	@NotEmpty
	@Pattern(regexp = "^[A-Za-z ]+$", message="Enter Country Name in Alphabets")
	private String country;
	@Digits(integer = 6, fraction = 0, message = "Enter Pincode in Number with Six Digits")
    private int pincode;
	
	public Address(){
		
	}
	public Address(int addressId, 
			@NotEmpty
			@Pattern(regexp = "^[A-Za-z ]+$", message="Enter State Name in Alphabets")
			String state, 
			@NotEmpty
			@Pattern(regexp = "^[A-Za-z ]+$", message="Enter Country Name in Alphabets")
			String country, 
			@Digits(integer = 6, fraction = 0, message = "Enter Pincode in Number with Six Digits")
			int pincode) {
		super();
		this.addressId = addressId;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}
	
	
	
}
