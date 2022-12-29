package com.example.fawry.service.CustomerService;

import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.example.fawry.database.DataBase;
import com.example.fawry.model.Cashe;
import com.example.fawry.model.CreditCard;
import com.example.fawry.model.Services;
import com.example.fawry.model.Wallet;

@Service
public class FinancialService {
	public boolean PayWithWallet(Wallet payment) {
    	//Services service= DataBase.getdb1().services.get(payment.getServiceName());
    	try {	
    		for (Map.Entry<String, Services> entry : DataBase.getdb1().services.entrySet()) {
        		 if(Objects.equals(entry.getKey().toLowerCase(), payment.getServiceName().toLowerCase()))
        		 {
        		    payment.pay(payment.getCost());
        			 entry.getValue().setCost(payment.getCost());
        			 return true;
        		 }
        			
        		        	
        	}
    		////////
    	//	if(DataBase.getdb1().services.get(payment.getServiceName())==null)
    			return false;
    	}catch (Exception e) {
            System.out.println("Exception in pay as" + e.getMessage());
        }
    	
//    	payment.pay(payment.getCost());
//    	DataBase.getdb1().services.get(payment.getServiceName()).setCost(payment.getCost());
//    	this.customer.setT(new Transaction(Customer.custid,payment.getCost()));
    	//DataBase.getdb1().customerTransactions.add(this.customer.getT());
    	return true;
    }
	public boolean PayWithCreditCard(CreditCard payment) {
    	//Services service= DataBase.getdb1().services.get(payment.getServiceName());
    	try {	
    		for (Map.Entry<String, Services> entry : DataBase.getdb1().services.entrySet()) {
        		 if(Objects.equals(entry.getKey().toLowerCase(), payment.getServiceName().toLowerCase()))
        		 {
        		    payment.pay(payment.getCost());
        			 entry.getValue().setCost(payment.getCost());
        			 return true;
        		 }
        			
        		        	
        	}
    		////////
    	//	if(DataBase.getdb1().services.get(payment.getServiceName())==null)
    			return false;
    	}catch (Exception e) {
            System.out.println("Exception in pay as" + e.getMessage());
        }
    	
//    	payment.pay(payment.getCost());
//    	DataBase.getdb1().services.get(payment.getServiceName()).setCost(payment.getCost());
//    	this.customer.setT(new Transaction(Customer.custid,payment.getCost()));
    	//DataBase.getdb1().customerTransactions.add(this.customer.getT());
    	return true;
    }
	public boolean PayWithCashe(Cashe payment) {
    	//Services service= DataBase.getdb1().services.get(payment.getServiceName());
    	try {	
    		for (Map.Entry<String, Services> entry : DataBase.getdb1().services.entrySet()) {
        		 if(Objects.equals(entry.getKey().toLowerCase(), payment.getServiceName().toLowerCase()))
        		 {
        		    payment.pay(payment.getCost());
        			 entry.getValue().setCost(payment.getCost());
        			 return true;
        		 }
        			
        		        	
        	}
    		////////
    	//	if(DataBase.getdb1().services.get(payment.getServiceName())==null)
    			return false;
    	}catch (Exception e) {
            System.out.println("Exception in pay as" + e.getMessage());
        }
    	
//    	payment.pay(payment.getCost());
//    	DataBase.getdb1().services.get(payment.getServiceName()).setCost(payment.getCost());
//    	this.customer.setT(new Transaction(Customer.custid,payment.getCost()));
    	//DataBase.getdb1().customerTransactions.add(this.customer.getT());
    	return true;
    }
	public boolean AddFundsToWallet(Wallet w) {
    	try {	
        		     w.addfunds(Wallet.getFunds());
        			 return true;
    	}
    	catch (Exception e) {
            System.out.println("Exception in pay as" + e.getMessage());
            return false;
        }
    }
	public boolean AddFundsToCreditCard(CreditCard creditcard) {
    	try {	
    		
        			 creditcard.addfunds(CreditCard.getFunds());
                     creditcard.getcardnum();
                     creditcard.getpass();
        			 return true;
        		 }
    	catch (Exception e) {
            System.out.println("Exception in pay as" + e.getMessage());
            return false;
        }
    }
}
