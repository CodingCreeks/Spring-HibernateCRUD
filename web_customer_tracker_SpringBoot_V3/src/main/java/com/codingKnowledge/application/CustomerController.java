package com.codingKnowledge.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService theCustomerService;

	@GetMapping("/hello")
	public String hello() {
		return "index";
	}

	@GetMapping("/list")
	public String getAllCustomers(Model theModel) {

		List<Customer> theCustomers = theCustomerService.getAllCustomers();

		theModel.addAttribute("customers", theCustomers);
		return "list-customers";
	}
}