package com.codingKnowledge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingKnowledge.entity.Customer;
import com.codingKnowledge.services.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService theCustomerService;

	@RequestMapping("/list")
	public String getCustomers(Model theModel) {
		theModel.addAttribute("customers", theCustomerService.getCustomers());
		return "list-customers";
	}

	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}

	@RequestMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
	     theCustomerService.saveCustomer(customer);
		return "redirect:/customer/list";
	}
	
	
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int id, Model theModel){
		theModel.addAttribute("customer", theCustomerService.updateCustomer(id));
		return "customer-form";
	}
	
	@RequestMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("customerId") int id){
		theCustomerService.deleteCustomer(id);
		return "redirect:/customer/list";
	}
}
