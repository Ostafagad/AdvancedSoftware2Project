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
import com.example.fawry.model.Service;
import com.example.fawry.model.Vodafone;
import com.example.fawry.model.VodafoneCreator;
import com.example.fawry.model.mobileRechargeService;
import com.example.fawry.service.AdminServices;

@RestController
@RequestMapping("/AdminController")
public class AdminController {
	
	@Autowired
	AdminServices adminService=new AdminServices();
	ProviderCreator pCreator=new VodafoneCreator();
	Provider vodafone=pCreator.creatProvider();
	Service service=new mobileRechargeService();
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
	
	 @PostMapping("/addProvider")
	    public Response addProvider(@RequestBody Vodafone p) {
		 	p=(Vodafone) this.vodafone;
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
	 @PostMapping("/addService")
	    public Response addService(@RequestBody mobileRechargeService service) {
		   service=(mobileRechargeService) this.service;
	        System.out.println("in add service" + service);
	        boolean res = adminService.addService(service);
	        Response response = new Response();
	        if (!res) {
	            response.setStatus(false);
	            response.setMessage("Service Already Exists");
	            return response;
	        }

	        response.setStatus(true);
	        response.setMessage("Service added successfully");
	        return response;
	    }
	 @PostMapping("/setoveralldiscount")
	 public Response setoveralldiscount(@RequestBody double d)
		{
		 Response response = new Response();
		 adminService.setoveralldiscount(d);
		 response.setStatus(true);
		 response.setMessage("overall discount added successfully");
		 return response;
		}
	 @PostMapping("/setspecificdiscount")
		public Response setspecificdiscount(@RequestBody double d)
		{
		 Response response = new Response();
		 response.setStatus(true);
		 response.setMessage("specific discount added successfully");
		 return response;
		}
	 @GetMapping ("/discount")
		public Response getdicount()
		{
		 Response response = new Response();
		response.object= adminService.getdicount();
		 return response;
		}
}
