package com.example.fawry.controller.AdminController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fawry.model.OverAllDiscount;
import com.example.fawry.model.Response;
import com.example.fawry.service.AdminService.RefundRequestService;

@RestController
@RequestMapping("/RefundRequestController")
public class RefundRequestController {
	 @Autowired
	 RefundRequestService refundRequestService=new RefundRequestService();
	@GetMapping("/acceptRefund/{id}")
    public Response acceptRefund(@PathVariable ("id") int id ) {
     
        System.out.println("in add OverAllDiscount");
        boolean res = refundRequestService.acceptRefund(id);
        Response response = new Response();
        if (!res) {
            response.setStatus(false);
            response.setMessage("Incorrect transaction ID");
            return response;
        }

        response.setStatus(true);
        response.setMessage("Transaction with corresponding ID has been accepted");
        return response;
    }
	
	@GetMapping("/rejectRefund/{id}")
    public Response rejectRefund(@PathVariable ("id") int id ) {
     
        System.out.println("in add OverAllDiscount");
        boolean res = refundRequestService.rejectRefund(id);
        Response response = new Response();
        if (!res) {
            response.setStatus(false);
            response.setMessage("Incorrect transaction ID");
            return response;
        }

        response.setStatus(true);
        response.setMessage("Transaction with corresponding ID has been declined");
        return response;
    }
	
}
