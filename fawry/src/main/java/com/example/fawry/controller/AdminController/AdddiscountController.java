package com.example.fawry.controller.AdminController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fawry.model.OverAllDiscount;
import com.example.fawry.model.Response;
import com.example.fawry.model.SpecificDiscount;
import com.example.fawry.model.Vodafone;
import com.example.fawry.service.AdminService.AddDiscount;
import com.example.fawry.service.AdminService.AddProvider;

@RestController
@RequestMapping("/AdddiscountController")
public class AdddiscountController {
	AddDiscount adddiscount=new AddDiscount();  
	 @PostMapping("/addoverAlldiscount")
    public Response addoverAlldiscount(@RequestBody OverAllDiscount v ) {
     
        System.out.println("in add OverAllDiscount");
        boolean res = adddiscount.addDiscount(v);
        Response response = new Response();
        if (!res) {
            response.setStatus(false);
            response.setMessage("OverAllDiscount for this service Already Exists");
            return response;
        }

        response.setStatus(true);
        response.setMessage("OverAllDiscount added to this service  successfully");
        return response;
    }
	 @PostMapping("/addSpecificdiscount")
	    public Response Specificdiscount(@RequestBody SpecificDiscount v ) {
	     
	        System.out.println("in add Specific discount");
	        boolean res = adddiscount.addDiscount(v);
	        Response response = new Response();
	        if (!res) {
	            response.setStatus(false);
	            response.setMessage("Specificdiscount for this service Already Exists");
	            return response;
	        }

	        response.setStatus(true);
	        response.setMessage("Specificdiscount added to this service  successfully");
	        return response;
	    }

}
