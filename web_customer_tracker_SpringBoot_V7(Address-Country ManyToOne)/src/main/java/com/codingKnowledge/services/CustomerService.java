package com.codingKnowledge.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingKnowledge.entity.Customer;
import com.codingKnowledge.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {

	@Autowired
	private CustomerRepository theCustomerRepository;

	public List<Customer> getCustomers() {
		return (List<Customer>) theCustomerRepository.findAll();
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
