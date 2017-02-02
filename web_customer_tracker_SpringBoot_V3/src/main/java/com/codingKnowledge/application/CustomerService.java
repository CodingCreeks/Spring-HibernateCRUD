package com.codingKnowledge.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerService {

	@Autowired
	private CustomerRepository theCustomerRepository;

	public List<Customer> getAllCustomers() {
		List<Customer> theCustomers = (List<Customer>) theCustomerRepository.findAll();
		return theCustomers;
	}
}
