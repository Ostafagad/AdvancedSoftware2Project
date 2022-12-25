package com.example.fawry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.fawry.database.DataBase;
import com.example.fawry.model.Provider;
import com.example.fawry.model.ProviderCreator;
import com.example.fawry.model.Response;
import com.example.fawry.model.Vodafone;
import com.example.fawry.model.VodafoneCreator;
import com.example.fawry.service.AdminServices;

@RestController
@RequestMapping("/AdminController")
public class AdminController {
	@Autowired
	AdminServices adminService=new AdminServices();
	ProviderCreator p=new VodafoneCreator();
	Provider v=p.creatProvider();
	@GetMapping ("/signIn/{name}")
	public Response<String> signIn(@PathVariable ("name") String name){
		Response<String> response=new Response();
		if(name==adminService.signIn(name)) {
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
	
	 @PostMapping("/add")
	    public Response addProvider(@RequestBody ProviderCreator p) {
		 	p=new VodafoneCreator();
	        System.out.println("in add provider" + p);
	        boolean res = adminService.addProvider(p);
	        Response response = new Response();
	        if (!res) {
	            response.setStatus(false);
	            response.setMessage("Provider Already Exists");
	            return response;
	        }

	        response.setStatus(true);
	        response.setMessage("Provider created successfully");
	        return response;
	    }
}
