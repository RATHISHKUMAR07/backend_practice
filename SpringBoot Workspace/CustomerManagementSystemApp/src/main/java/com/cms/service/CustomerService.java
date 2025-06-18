package com.cms.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.cms.entity.Address;
import com.cms.entity.Customer;
import com.cms.exception.CustomerNotFoundException;
import com.cms.repository.AddressRepository;
import com.cms.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private AddressRepository addressRepository;

	public List<Customer> getAllCustomers() {
		List<Customer> optionalCustomer = customerRepository.findAll();
		if (optionalCustomer.isEmpty()) {
			throw new CustomerNotFoundException("Empty database add customers to display " + optionalCustomer.size() + " Customers in database");
		} else {
			List<Customer> customer = new ArrayList<>();
			customerRepository.findAll().forEach(customer::add);

			return customer;
		}

	}

	public Optional<Customer> getCustomerById(int id) {
		Optional<Customer> optionalCustomer = customerRepository.findById(id);
		if (!optionalCustomer.isPresent()) {
			throw new CustomerNotFoundException("Customer with the id is not found in the database " + id);
		} else {
			return customerRepository.findById(id);
		}
	}

	public void addCustomer(Customer customer) {
		Optional<Customer> optionalCustomer = customerRepository.findById(customer.getId());
		if (optionalCustomer.isPresent()) {
			throw new CustomerNotFoundException(
					"Customer with the same id already added into database add with new id " + customer.getId());
		} else {
			customerRepository.save(customer);
			addressRepository.save(customer.getAddress());
		}
	}

	public void updateCustomer(Customer updateCustomer, int id) {
		Optional<Customer> optionalCustomer = customerRepository.findById(id);

		if (!optionalCustomer.isPresent()) {
			throw new CustomerNotFoundException("No Customer is found with given Customer Id : " + id);
		} else {
			Customer existingCustomer = optionalCustomer.get();

			existingCustomer.setId(updateCustomer.getId());
			existingCustomer.setName(updateCustomer.getName());
			existingCustomer.setAge(updateCustomer.getAge());
			// existingCustomer.setDob(updateCustomer.getDob());
			existingCustomer.setBloodGroup(updateCustomer.getBloodGroup());
			existingCustomer.setAddress(updateCustomer.getAddress());

			addressRepository.save(updateCustomer.getAddress());

			customerRepository.save(existingCustomer);
		}

	}

	public void deleteCustomer(int id) {
		Optional<Customer> optionalCustomer = customerRepository.findById(id);

		if (!optionalCustomer.isPresent()) {
			throw new CustomerNotFoundException(
					"No Customer is found with given Customer Id to delete Customer : " + id);
		} else {
			customerRepository.deleteById(id);
		}
	}

	public List<Customer> getCustomerByBloodGroup(String bloodGroup) {
		List<Customer> optionalCustomer = customerRepository.getCustomerByBloodGroup(bloodGroup);
		if (optionalCustomer.size() == 0) {
			throw new CustomerNotFoundException("No Customer found with given blood group " + bloodGroup);
		} else {
			return customerRepository.getCustomerByBloodGroup(bloodGroup);
		}
	}

	public List<Customer> getCustomerByAge(int age) {
		List<Customer> optionalCustomer = customerRepository.getCustomerByAge(age);
		if (optionalCustomer.size() == 0) {
			throw new CustomerNotFoundException("No Customer found with given Age greater than " + age);
		} else {
			return customerRepository.getCustomerByAge(age);
		}
	}

	public List<Customer> getCustomerByCountry(String country) {
		List<Customer> optionalCustomer = customerRepository.getCustomersByCountry(country);
		if (optionalCustomer.size() == 0) {
			throw new CustomerNotFoundException("No Customer found with given Country " + country);
		} else {
		List<Customer> list = new ArrayList<>();
		customerRepository.getCustomersByCountry(country).forEach(list::add);
		return list;
		}
	}

}
