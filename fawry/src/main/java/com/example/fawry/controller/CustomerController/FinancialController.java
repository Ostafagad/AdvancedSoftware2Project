package com.example.fawry.controller.CustomerController;

import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fawry.database.DataBase;
import com.example.fawry.model.Response;
import com.example.fawry.model.Services;
import com.example.fawry.model.Wallet;
import com.example.fawry.service.CustomerService.FinancialService;
import com.example.fawry.service.CustomerService.SearchService;
@RestController
@RequestMapping("/FinancialController")
public class FinancialController {
	@Autowired
	FinancialService financialservice=new FinancialService();
	@PostMapping("/pay")
    public Response pay(@RequestBody Wallet wallet) {
		System.out.println("in pay" + wallet);
		boolean res=financialservice.pay(wallet);
		Response response = new Response();
		if (!res) {
            response.setStatus(false);
            response.setMessage("Write service name in acorrect way");
            response.object=null;
            return response;
        }

        response.setStatus(true);
        response.setMessage("payment process is successful");
        response.object=wallet;
        return response;
	}
	
}
