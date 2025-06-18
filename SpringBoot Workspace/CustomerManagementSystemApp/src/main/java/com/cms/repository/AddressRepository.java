package com.cms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cms.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{
	
	@Query("SELECT a FROM Address a WHERE a.country LIKE %:country%")
	public List<Address> getAddressByCountry(@Param("country") String country );


//	@Query("SELECT a FROM CUSTOMER a WHERE a.country like %:country%")
//	List<Customer> getCustomerByCountry(@Param("country") String country);
}
