package com.example.fawry.controller.AdminController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fawry.model.Response;

import com.example.fawry.service.AdminService.AdminRegistration;
@RestController
@RequestMapping("/AdminRegistrationController")
public class AdminRegistrationController {
	@Autowired
	AdminRegistration adminRegistration=new AdminRegistration();  
	@GetMapping ("/signIn/{name}")
	  public Response<String> signIn(@PathVariable ("name") String name){
	    Response<String> response=new Response();
	    if(name==adminRegistration.signIn(name)) {
	      response.setStatus(true);
	      response.setMessage("Admin signed in successfully");
	      response.object=name;
	    }
	    else
	    {
	      response.setStatus(false);
	      response.setMessage("Wrong user name or password");
	      response.object=null;
	    }
	    return response;
	  }
}
