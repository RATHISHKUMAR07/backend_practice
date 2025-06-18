package com.cms.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.cms.entity.Address;
import com.cms.entity.Address;
import com.cms.repository.AddressRepository;
import com.cms.repository.CustomerRepository;
@Service
public class AddressService implements IAddressService{

	@Autowired
	private AddressRepository addressRepository;
	//@Autowired
	//private CustomerRepository customerRepository;

	
	public List<Address> getAllAddress(){
		List<Address> address = new ArrayList<>();
		addressRepository.findAll()
		.forEach(address::add);
		
		return address;
		
	}
	
	public Optional<Address> getAddressById(int id) {
		return addressRepository.findById(id);
	}
	
	public void addAddress(Address Address){
		addressRepository.save(Address);
	}
	
	public void updateAddress(Address updateAddress, int id) {
		Optional<Address> optionalAddress = addressRepository.findById(id);
		
		if(optionalAddress.isPresent()) {
			Address existingAddress = optionalAddress.get();
			
			existingAddress.setAddressId(updateAddress.getAddressId());
			existingAddress.setState(updateAddress.getState());
			existingAddress.setCountry(updateAddress.getCountry());
			existingAddress.setPincode(updateAddress.getPincode());
			
			addressRepository.save(existingAddress);
			//customerRepository.save(existingAddress);
		}
		
	}
	
	public void deleteAddress(int id) {
		addressRepository.deleteById(id);
	}
	

	public List<Address> getAddressByCountry(String country){
		return addressRepository.getAddressByCountry(country);
	}


}
