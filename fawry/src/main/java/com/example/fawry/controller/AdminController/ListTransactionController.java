package com.example.fawry.controller.AdminController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.fawry.model.TransactionModel.Transaction;
import com.example.fawry.service.AdminService.ListTransaction;

@RestController
@RequestMapping("/ListTransactionController")
public class ListTransactionController {
	@Autowired
	ListTransaction transactions=new ListTransaction();
	
	@GetMapping("/paymenttransactions/{type}")
	public ArrayList<Transaction> getPaymentTransactions(@PathVariable("type") String type) {
        System.out.println("get All Transactions");
        return transactions.listTransactions(type);
    }
	
	@GetMapping("/refundtransactions/{type}")
	public ArrayList<Transaction> getRefunTransactions(@PathVariable("type") String type) {
        System.out.println("get All Transactions");
        return transactions.listTransactions(type);
    }
	
	@GetMapping("/wallettransactions/{type}")
	public ArrayList<Transaction> getWalletTransactions(@PathVariable("type") String type) {
        System.out.println("get All Transactions");
        return transactions.listTransactions(type);
    }
	
}
