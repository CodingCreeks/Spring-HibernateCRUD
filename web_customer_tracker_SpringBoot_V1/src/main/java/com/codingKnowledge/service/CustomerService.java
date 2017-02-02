package com.codingKnowledge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingKnowledge.Entity.Customer;
import com.codingKnowledge.Repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository theCustomerRepository;

	public List<Customer> getAllCustomers() {
		List<Customer> theCustomers = (List<Customer>) theCustomerRepository.findAll();
		return theCustomers;
	}

	public void saveCustomer(Customer theCustomer) {
		theCustomerRepository.save(theCustomer);
	}
}
