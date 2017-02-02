package com.codingKnowledge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingKnowledge.Entity.Customer;
import com.codingKnowledge.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService theCustomerService;

	@RequestMapping("/list")
	public String getAllCustomer(Model theModel) {
		List<Customer> customers = theCustomerService.getAllCustomers();
		theModel.addAttribute(customers);
		return "list-customers";
	}
}
