package com.codingKnowledge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingKnowledge.dao.CustomerRepository;
import com.codingKnowledge.entity.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository theCustomerRepository;

	public List<Customer> getCustomers() {

		List<Customer> theCustomers = (List<Customer>) theCustomerRepository.findAll();
		return theCustomers;
	}

	public void saveCustomer(Customer customer) {
		theCustomerRepository.save(customer);
	}

	public Customer updateCustomer(int id) {
		return theCustomerRepository.findOne(id);
	}

	public void deleteCustomer(int id) {
		theCustomerRepository.delete(id);
	}
}
