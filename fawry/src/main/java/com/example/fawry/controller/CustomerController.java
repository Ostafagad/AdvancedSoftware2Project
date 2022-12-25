package com.example.fawry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fawry.model.Account;
import com.example.fawry.model.Response;
import com.example.fawry.service.CustomerServices;

@RestController
@RequestMapping("/CustomerController")
public class CustomerController {
	@Autowired
	CustomerServices cust_ser=new CustomerServices();
	
	 @PostMapping("/signup")
	    public Response signup(@RequestBody Account a) {
	        System.out.println("in add customer" + a);
	        boolean res = cust_ser.SignUP(a);
	        Response response = new Response();
	        if (!res) {
	            response.setStatus(false);
	            response.setMessage("UserName or Email Already Exists");
	            return response;
	        }

	        response.setStatus(true);
	        response.setMessage("Account created successfully");
	        return response;
	    }

		@GetMapping("/signin/{pass}/{email}")
	    public Response<Account> signin(@PathVariable("pass") String pass,@PathVariable("email") String email) {
	        var customer = cust_ser.SignIn(email,pass);
	        Response<Account> response = new Response<Account>();
	        if (customer == null ) {
	        	response.setStatus(false);
	            response.setMessage("Account Not Found");
	            response.object = null;

		        return response;
	        }
	        response.setStatus(true);
	        response.setMessage("Sign in Successfully");
	        response.object = customer;

            return response;

	        
	    }
	

}
