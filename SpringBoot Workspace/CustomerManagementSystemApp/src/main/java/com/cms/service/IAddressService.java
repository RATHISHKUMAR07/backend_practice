package com.cms.service;
import com.cms.entity.Address;

import java.util.List;
import java.util.Optional;

public interface IAddressService {

	List<Address> getAllAddress();
	
	Optional<Address> getAddressById(int id);
	
	void addAddress(Address address);
	
	void updateAddress(Address address,int id);
	
	void deleteAddress(int id);
	
	List<Address> getAddressByCountry(String country);
	
}
