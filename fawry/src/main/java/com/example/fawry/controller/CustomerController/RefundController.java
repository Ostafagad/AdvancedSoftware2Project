package com.example.fawry.controller.CustomerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fawry.model.Response;
import com.example.fawry.model.Transaction;
import com.example.fawry.service.CustomerService.Refund;
@RestController
@RequestMapping("/RefundController")
public class RefundController {
	@Autowired
	Refund refund=new Refund();
	@GetMapping("/askForRefund/{id}")
    public  Response <Transaction> askForRefund(@PathVariable ("id") int transactionId) {
		System.out.println("in ask for refund " + transactionId);
		Transaction res=refund.askForRefund(transactionId);
		Response<Transaction> response = new Response<Transaction>();
		if (res==null) {
            response.setStatus(false);
            response.setMessage("Wrong Transaction ID.Try to rewrite it");
            response.object=null;
            return response;
        }

        response.setStatus(true);
        response.setMessage("Your refund has been sent.Wait for a response");
        response.object=res;
        return response;
	}
	
	@GetMapping("/CheckRefund/{id}")
    public  Response  CheckRefund(@PathVariable ("id") int transactionId) {
		System.out.println("in ask for refund " + transactionId);
		boolean res=refund.CheckRefund(transactionId);
		Response response = new Response();
		if (!res) {
            response.setStatus(false);
            response.setMessage("Your refund request has been rejected");
            return response;
        }

        response.setStatus(true);
        response.setMessage("Your refund request has been accepted");
        return response;
	}
	
}
