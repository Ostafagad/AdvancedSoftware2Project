package com.example.fawry.controller.AdminController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fawry.model.Response;
import com.example.fawry.model.ProvidersModel.Etisalat;
import com.example.fawry.model.ProvidersModel.Orange;
import com.example.fawry.model.ProvidersModel.Vodafone;
import com.example.fawry.model.ProvidersModel.We;
import com.example.fawry.service.AdminService.AddProvider;
@RestController
@RequestMapping("/ProviderController")
public class ProviderController {
	@Autowired
	AddProvider addProvider=new AddProvider();  
	 @PostMapping("/addVodafone")
     public Response addProvider(@RequestBody Vodafone v ) {
      
         System.out.println("in add provider");
         boolean res = addProvider.addProvider(v);
         Response response = new Response();
         if (!res) {
             response.setStatus(false);
             response.setMessage("Vodafone Provider Already Exists");
             return response;
         }

         response.setStatus(true);
         response.setMessage("Vodafone Provider created successfully");
         return response;
     }
  @PostMapping("/addOrange")
  public Response addProvider(@RequestBody Orange o ) {
   
      System.out.println("in add provider");
      boolean res = addProvider.addProvider(o);
      Response response = new Response();
      if (!res) {
          response.setStatus(false);
          response.setMessage("Orange Provider Already Exists");
          return response;
      }

      response.setStatus(true);
      response.setMessage("Orange Provider created successfully");
      return response;
  }
  @PostMapping("/addEtisalat")
  public Response addProvider(@RequestBody Etisalat e ) {
   
      System.out.println("in add provider");
      boolean res = addProvider.addProvider(e);
      Response response = new Response();
      if (!res) {
          response.setStatus(false);
          response.setMessage("Etisalat Provider Already Exists");
          return response;
      }

      response.setStatus(true);
      response.setMessage("Etisalat Provider created successfully");
      return response;
  }
  @PostMapping("/addWe")
  public Response addProvider(@RequestBody We w) {
   
      System.out.println("in add provider");
      boolean res = addProvider.addProvider(w);
      Response response = new Response();
      if (!res) {
          response.setStatus(false);
          response.setMessage("Etisalat Provider Already Exists");
          return response;
      }

      response.setStatus(true);
      response.setMessage("Etisalat Provider created successfully");
      return response;
  }
}
