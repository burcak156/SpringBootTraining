package com.training.spring.controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.controller.bean.CustomerBean;
import com.training.spring.service.CustomerService;

@RestController
@RequestMapping(path="/api/v1/customer")
@Validated
public class CustomerController {
	
	@Autowired
	private CustomerService custService;
	
	@GetMapping(path="/get")
	public CustomerBean getCustomer(@NotNull @RequestParam("custid") final Long customerId) {
		return null;
	}
	
	@PostMapping(path="/add")
	public String addCustomer (@Validated @RequestBody final CustomerBean cust) {
		return "";
		
	}
	
	@DeleteMapping(path="/delete")
	public String deleteCustomer (@NotNull @RequestParam(value="custid") final Long customerId ) {
		return customerId + "";
		
	}
	/*
	@DeleteMapping("/delete/{id}")
	 public String deleteById(@PathVariable("id") Long id) {
	    return "Delete by id called";
	 }
	*/

}
