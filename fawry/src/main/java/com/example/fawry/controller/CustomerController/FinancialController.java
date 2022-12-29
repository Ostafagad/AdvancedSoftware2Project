package com.example.fawry.controller.CustomerController;

import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fawry.database.DataBase;
import com.example.fawry.model.Cashe;
import com.example.fawry.model.CreditCard;
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
	@PostMapping("/paywallet")
    public Response PayWithWallet(@RequestBody Wallet wallet) {
		System.out.println("in pay" + wallet);
		boolean res=financialservice.PayWithWallet(wallet);
		Response response = new Response();
		if (!res) {
            response.setStatus(false);
            response.setMessage("Write service name in acorrect way");
            response.object=null;
            return response;
        }

        response.setStatus(true);
        response.setMessage("payment process with Wallet is successful");
        response.object=wallet;
        return response;
	}
	
	@PostMapping("/paycreditcard")
    public Response paywithcreditcard(@RequestBody CreditCard creditcard) {
		System.out.println("in pay with " + creditcard);
		boolean res=financialservice.PayWithCreditCard(creditcard);
		Response response = new Response();
		if (!res) {
            response.setStatus(false);
            response.setMessage("Write service name in acorrect way");
            response.object=null;
            return response;
        }

        response.setStatus(true);
        response.setMessage("payment process with CreditCard is successful");
        response.object=creditcard;
        return response;
	}
	@PostMapping("/paycashe")
    public Response paywithcreditcard(@RequestBody Cashe cashe) {
		System.out.println("in pay with " + cashe);
		boolean res=financialservice.PayWithCashe(cashe);
		Response response = new Response();
		if (!res) {
            response.setStatus(false);
            response.setMessage("Write service name in acorrect way");
            response.object=null;
            return response;
        }

        response.setStatus(true);
        response.setMessage("payment process with Cashe is successful");
        response.object=cashe;
        return response;
	}
	@PostMapping("/addfundstowallet")
    public Response addfundstowallet(@RequestBody CreditCard card) {
		System.out.println("in pay with " + card);
		boolean res=financialservice.AddFundsToWallet(card);
		Response response = new Response();
		if (!res) {
            response.setStatus(false);
            response.setMessage("Write Wallet details in acorrect way");
            response.object=null;
            return response;
        }

        response.setStatus(true);
        response.setMessage("Add to Wallet process is successful");
        response.object=card;
        return response;
	}
	@PostMapping("/addfundstocreditcard")
    public Response addfundstocreditcard(@RequestBody CreditCard creditcard) {
		System.out.println("in pay with " + creditcard);
		boolean res=financialservice.AddFundsToCreditCard(creditcard);
		Response response = new Response();
		if (!res) {
            response.setStatus(false);
            response.setMessage("Write CreditCard details in acorrect way");
            response.object=null;
            return response;
        }

        response.setStatus(true);
        response.setMessage("Add to credit card process is successful");
        response.object=creditcard;
        return response;
	}
}
