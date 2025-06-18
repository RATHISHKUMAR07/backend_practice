package com.cms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class Customer{
	@Id
	private int id;
	@NotEmpty
	@Pattern(regexp = "^[A-Za-z ]+$",message="The blood group shoul be A+ A-")
	private String name;
	@NotNull
	private int age;
	@NotEmpty
	@Pattern(regexp = "^[A-Za-z+-]+$",message="The blood group shoul be A+ A-")
	private String bloodGroup;
	
	@ManyToOne 
	private Address address;

	public Customer() {
		
	}
	
	public Customer(int id,
			@NotEmpty @Pattern(regexp = "^[A-Za-z ]+$", message = "The blood group shoul be A+ A-") String name,
			@NotNull @Pattern(regexp = "^[0-9]+$", message = "Enter Age in number like 18") int age,
			@NotEmpty @Pattern(regexp = "^[A-Za-z+-]+$", message = "The blood group shoul be A+ A-") String bloodGroup,
			Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.bloodGroup = bloodGroup;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", bloodGroup=" + bloodGroup + ", address="
				+ address + "]";
	}
	
	
	
	
}