package com.example.fawry.controller.AdminController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fawry.model.Response;
import com.example.fawry.model.ServiceModel.Donations;
import com.example.fawry.model.ServiceModel.InternetPaymentServices;
import com.example.fawry.model.ServiceModel.LandlineServices;
import com.example.fawry.model.ServiceModel.MonthlyReceipt;
import com.example.fawry.model.ServiceModel.QuarterReceipt;
import com.example.fawry.model.ServiceModel.mobileRechargeService;
import com.example.fawry.service.AdminService.AddService;
@RestController
@RequestMapping("/ServiceController")
public class ServiceController {
	@Autowired
	AddService addService=new AddService();  
	 @PostMapping("/addmobileRechargeService")
     public Response addService(@RequestBody mobileRechargeService service) {
   
          System.out.println("in add service" + service);
          boolean res = addService.addService(service);
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
  @PostMapping("/addInternetPaymentServices")
  public Response addService(@RequestBody InternetPaymentServices service) {

       System.out.println("in add service" + service);
       boolean res = addService.addService(service);
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
  @PostMapping("/addDonations")
  public Response addService(@RequestBody Donations service) {

       System.out.println("in add service" + service);
       boolean res = addService.addService(service);
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
  @PostMapping("/addLandlineServices")
  public Response addService(@RequestBody LandlineServices service) {

       System.out.println("in add service" + service);
       boolean res = addService.addService(service);
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
  @PostMapping("/addQuarterReceipt")
  public Response addService(@RequestBody QuarterReceipt service) {

       System.out.println("in add service" + service);
       boolean res = addService.addService(service);
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
  @PostMapping("/addMonthlyReceipt")
  public Response addService(@RequestBody MonthlyReceipt service) {

       System.out.println("in add service" + service);
       boolean res = addService.addService(service);
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
}
