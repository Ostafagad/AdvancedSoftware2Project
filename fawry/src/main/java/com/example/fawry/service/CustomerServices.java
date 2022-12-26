package com.example.fawry.service;

import com.example.fawry.model.Account;
import com.example.fawry.model.AskforRefund;
import com.example.fawry.model.BaseCommand;
import com.example.fawry.model.Customer;
import com.example.fawry.model.Payment;
import com.example.fawry.model.Services;
import com.example.fawry.model.Transaction;
import com.example.fawry.model.Wallet;

import org.springframework.stereotype.Service;

import com.example.fawry.database.DataBase;
@Service
public class CustomerServices {
	Customer customer=new Customer();
	private BaseCommand bc;
	Payment payment=new Wallet();
    public Boolean SignUP(Account a) {
        try {
        	
            if (DataBase.getdb1().cust_accounts.get(a.getEmail().toLowerCase()) != null) {
                return false;
            }
            DataBase.getdb1().cust_accounts.put(a.getEmail().toLowerCase(), a);
        } catch (Exception e) {
            System.out.println("Exception in account as" + e.getMessage());
            return false;
        }
        return true;
    }
    public Account SignIn(String em,String pass) {
        try {
//        	Account a=DataBase.getdb1().cust_accounts.get(em);
//        	if(a.getPassword()==pass)
    			return DataBase.getdb1().cust_accounts.get(em);

        		
//        	for (Map.Entry<String, Account> entry : DataBase.getdb1().cust_accounts.entrySet()) {
//        		if(entry.getKey()==em)
//        		{
//        			return DataBase.getdb1().cust_accounts.get(em);
//        		}
//        	}
           
        } catch (Exception e) {
            System.out.println("Exception in getCustomer as" + e.getMessage());
        }
        return null;
    }

    
//    public void chooseCommand(BaseCommand bc) {
// 	   this.bc=bc;
//    }
    public boolean pay(Payment payment,double cost,String serviceName) {
    	Services service= DataBase.getdb1().services.get(serviceName);;
    	try {	 
    		if(service==null)
    			return false;
    	}catch (Exception e) {
            System.out.println("Exception in pay as" + e.getMessage());
        }
    	
    	payment.pay(cost);
    	service.setCost(cost);
    	this.customer.setT(new Transaction(Customer.custid,cost));
    	DataBase.customerTransactions.add(this.customer.getT());
    	return true;
    }
    
   public void refundRequest(int id) {
	   this.bc=new AskforRefund();
	   for(Transaction t: DataBase.getdb1().customerTransactions)
 	   {  
 		   if(id==Transaction.transid) {
 			  this.bc.execute(t);
 			  break;
 		   }
 	   }
	   
   }
}
