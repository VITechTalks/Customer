package com.xyz.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.api.model.Customer;
import com.xyz.api.repo.CustomerRepository;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
	
	@Autowired
	private CustomerRepository repo;
	
	
	//1.Save
	@PostMapping("/insert")
	public String saveCustomer(@RequestBody  Customer  customer) {
		
		System.out.println("Input request =="+ customer);
		
		 repo.save(customer);
		
		return "Customer details saved successfully for id "+ customer.getcId();
		
	}
	
	//2. get customer
	
	@GetMapping("/cid/{customerId}")
	public Customer getOne(@PathVariable  Integer customerId ) {
		
		System.out.println("get value for cid ="+customerId);
		
		Optional<Customer> result = repo.findById(customerId);
		
		return result.get();
		
	}
	
	//3. delete customer 
	@DeleteMapping("/delete/{custId}")
	public String deltedValues(@PathVariable Integer custId ) {
		System.out.println("Inside delete method ");
		
		repo.deleteById(custId);
		
		return "Customer Id "+custId+" Delted succsssfully";
		
	}
	
	//4.Update 
	
	//5. get all customer
	@GetMapping("/all")
	public List<Customer> getAllcustomers() {
		
		System.out.println("Inside get all method");
		List<Customer> findAll = repo.findAll();
		
		return findAll;
		
	}

}
