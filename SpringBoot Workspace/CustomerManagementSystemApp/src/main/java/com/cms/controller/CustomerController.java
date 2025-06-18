package com.cms.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cms.entity.Address;
import com.cms.entity.Customer;
import com.cms.service.IAddressService;
import com.cms.service.ICustomerService;


@RestController
@CrossOrigin("http://localhost:3000")
public class CustomerController {

	@Autowired
	private ICustomerService iCustomerService;
	@Autowired
	private IAddressService iAddressService;
	
	
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		return iCustomerService.getAllCustomers();
	}
	
	@GetMapping("/customers/{id}")
	public Optional<Customer> getCustomerById(@PathVariable int id) {
		return iCustomerService.getCustomerById(id);
	}
	
	@PostMapping("/customers")
	public void addCustomers(@RequestBody Customer customer) {
		iCustomerService.addCustomer(customer);
		iAddressService.addAddress(customer.getAddress());
	}
	
	@PutMapping("/customers/{id}")
	public void updateCustomer(@RequestBody Customer customer, @PathVariable int id) {
		iCustomerService.updateCustomer(customer, id);
		iAddressService.updateAddress(customer.getAddress(), customer.getAddress().getAddressId());
	}
	
	
	@DeleteMapping("/customers/{id}")
	public void deleteCustomer(@PathVariable int id) {
		iCustomerService.deleteCustomer(id);
	}
	
	@GetMapping("/customers/bloodGroup/{bloodGroup}")
	public List<Customer> getCustomerByBloodGroup(@PathVariable String bloodGroup){
		return iCustomerService.getCustomerByBloodGroup(bloodGroup);
	}
	
	@GetMapping("/customers/age/{age}")
	public List<Customer> getCustomerByAge(@PathVariable int age){
		return iCustomerService.getCustomerByAge(age);
	}
	
	@GetMapping("/customers/address/country/{country}")
	public List<Customer> getCustomerByCountry(@PathVariable String country){
		return iCustomerService.getCustomerByCountry(country);
	}

}
