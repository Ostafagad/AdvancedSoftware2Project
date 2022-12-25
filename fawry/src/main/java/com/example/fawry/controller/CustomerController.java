package com.example.fawry.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	

}
