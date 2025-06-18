package com.cms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cms.entity.Address;
//import com.cms.entity.Address;
import com.cms.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	@Query("SELECT c FROM Customer c WHERE c.bloodGroup like %:bloodGroup%")
	List<Customer> getCustomerByBloodGroup(@Param("bloodGroup") String bloodGroup);
	
	@Query("SELECT c FROM Customer c WHERE c.age >= :age")
	List<Customer> getCustomerByAge(@Param("age") int age);
	
	@Query("SELECT c FROM Customer c WHERE c.address.country LIKE :country")
	List<Customer> getCustomersByCountry(@Param("country") String country);


}
