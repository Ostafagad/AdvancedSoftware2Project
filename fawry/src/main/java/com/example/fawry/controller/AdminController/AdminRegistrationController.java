package com.example.fawry.controller.AdminController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fawry.model.Account;
import com.example.fawry.model.Response;

import com.example.fawry.service.AdminService.AdminRegistration;
@RestController
@RequestMapping("/AdminRegistrationController")
public class AdminRegistrationController {
	@Autowired
	AdminRegistration adminRegistration=new AdminRegistration();  
	@PostMapping("/signup")
    public Response signup(@RequestBody Account a) {
        System.out.println("In Add Admin" + a);
        boolean res = adminRegistration.SignUP(a);
        Response response = new Response();
        if (!res) {
            response.setStatus(false);
            response.setMessage("Admin UserName or Email Already Exists");
            return response;
        }

        response.setStatus(true);
        response.setMessage("Admin Account created successfully");
        response.object=a;
        return response;
    }
 @GetMapping("/signin/{pass}/{email}")
    public Response<Account> signin(@PathVariable("pass") String pass,@PathVariable("email") String email) {
        var customer = adminRegistration.SignIn(email,pass);
        Response<Account> response = new Response<Account>();
        if (customer == null ) {
        	response.setStatus(false);
            response.setMessage("Admin Account Not Found");
            response.object = null;

	        return response;
        }
        response.setStatus(true);
        response.setMessage("Admin Sign in Successfully");
        response.object = customer;

     return response;

        
    }
}
