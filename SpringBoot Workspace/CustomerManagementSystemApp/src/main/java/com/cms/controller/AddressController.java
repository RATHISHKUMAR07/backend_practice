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
import com.cms.service.IAddressService;

@RestController
@CrossOrigin("http://localhost:3000")
public class AddressController {
	
	@Autowired
	private IAddressService iAddressService;
	
	@GetMapping("/address")
	public List<Address> getAllAddress(){
		return iAddressService.getAllAddress();
	}
	
	@GetMapping("/address/{id}")
	public Optional<Address> getAddressById(@PathVariable int id){
		return iAddressService.getAddressById(id);
	}
	
	@PostMapping("/address")
	public void addAddress(@RequestBody Address address) {
		iAddressService.addAddress(address);
	}
	
	@PutMapping("/address/{id}")
	public void updateAddress(@RequestBody Address address,@PathVariable int id) {
		iAddressService.updateAddress(address, id);
	}
	
	@DeleteMapping("/address/{id}")
	public void deleteAddress(@PathVariable int id) {
		iAddressService.deleteAddress(id);
	}
	
	@GetMapping("/address/country/{country}")
	public List<Address> getAddressByCountry(@PathVariable String country){
		return iAddressService.getAddressByCountry(country);
	}
}
