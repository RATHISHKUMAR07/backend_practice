package com.cms.service;

import java.util.List;
import java.util.Optional;


//import com.cms.entity.Address;
import com.cms.entity.*;

public interface ICustomerService{
	
	List<Customer> getAllCustomers();
	
	Optional<Customer> getCustomerById(int id);
	
	void addCustomer(Customer customer);
	
	void updateCustomer(Customer customer, int id);
	
	void deleteCustomer(int id);
	
	List<Customer> getCustomerByBloodGroup(String bloodGroup);
	
	List<Customer> getCustomerByAge(int age);

	List<Customer> getCustomerByCountry(String country);
	

	
}
