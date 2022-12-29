package com.example.fawry.service.CustomerService;

import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.example.fawry.database.DataBase;
import com.example.fawry.model.Cashe;
import com.example.fawry.model.CreditCard;
import com.example.fawry.model.Services;
import com.example.fawry.model.Transaction;
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
        			 Transaction t=new Transaction(payment.getServiceName(),payment.getCost(),"Payment",false);
        			 DataBase.customerTransactions.put(Transaction.getTransactionId(), t);
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
        			 Transaction t=new Transaction(payment.getServiceName(),payment.getCost(),"Payment",false);
        			 DataBase.customerTransactions.put(Transaction.getTransactionId(), t);
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
        			 Transaction t=new Transaction(payment.getServiceName(),payment.getCost(),"Payment",false);
        			 DataBase.customerTransactions.put(Transaction.getTransactionId(), t);
        			 return true;
        		 }
        			
        		        	
        	}
    		
    			return false;
    	}catch (Exception e) {
            System.out.println("Exception in pay as" + e.getMessage());
        }
    	

    	return true;
    }
	public boolean AddFundsToWallet(CreditCard card) {
    	try {	
        		     card.AddFundsToWallet(CreditCard.getFunds());
        		     Transaction t=new Transaction("AddToWallet",CreditCard.getFunds(),"Wallet",false);
        			 DataBase.customerTransactions.put(Transaction.getTransactionId(), t);
        			 return true;
    	}
    	catch (Exception e) {
            System.out.println("Exception in pay as" + e.getMessage());
            return false;
        }
    }
	public boolean AddFundsToCreditCard(CreditCard creditcard) {
    	try {	
    		
        			 creditcard.addfunds();
                     creditcard.getcardnum();
                     creditcard.getpass();
        			 return true;
        		 }
    	catch (Exception e) {
            System.out.println("Exception in pay as" + e.getMessage());
            return false;
        }
    }
	
	public boolean askForRefund(int transactionId) {
		
		try {	
    		for (Map.Entry<Integer,Transaction> entry : DataBase.getdb1().customerTransactions.entrySet()) {
        		 if(Objects.equals(entry.getKey(), transactionId))
        		 {
        		    
        			 DataBase.refunds.put(entry.getKey(), entry.getValue());
        			 return true;
        		 }		
        		        	
        	}
    		
    			return false;
    	}catch (Exception e) {
            System.out.println("Exception in pay as" + e.getMessage());
        }
		return true;
	}
	
}
