package com.example.fawry.service.CustomerService;

import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.example.fawry.database.DataBase;




import com.example.fawry.model.DiscountModel.DiscountDecorator;
import com.example.fawry.model.PaymentModel.Cashe;
import com.example.fawry.model.PaymentModel.CreditCard;
import com.example.fawry.model.PaymentModel.Wallet;
import com.example.fawry.model.ServiceModel.Services;
import com.example.fawry.model.TransactionModel.Transaction;

@Service
public class FinancialService {
	public boolean PayWithWallet(Wallet payment) {
    	try {	
    		for (Map.Entry<String, Services> entry : DataBase.getdb1().services.entrySet()) {
        		 if(Objects.equals(entry.getKey().toLowerCase(), payment.getServiceName().toLowerCase()))
        		 {
        			 double dis=0;
        			 for (DiscountDecorator discount : DataBase.getdb1().discounts )  {
        				 if(payment.getServiceName().equals(discount.getsername()))
        					 dis+=discount.getdiscount(); 
        			 }
        			 if(dis!=0) {
        				 
        				 payment.setCost(payment.getCost()-(payment.getCost()*dis));
  
        		    payment.pay(payment.getCost());
        			 entry.getValue().setCost(payment.getCost());
        			 Transaction t=new Transaction(payment.getServiceName(),payment.getCost(),"payment",false);
        			 DataBase.customerTransactions.put(Transaction.getTransactionId(), t);
        			 }
        			 else
        			 {
        				  payment.pay(payment.getCost());
             			 entry.getValue().setCost(payment.getCost());
             			 Transaction t=new Transaction(payment.getServiceName(),payment.getCost(),"payment",false);
             			 DataBase.customerTransactions.put(Transaction.getTransactionId(), t);
        			 
        			 }
        			 return true;
        		 }
        			
        		        	
        	}
    	
    			return false;
    	}catch (Exception e) {
            System.out.println("Exception in pay as" + e.getMessage());
        }
    	return true;
    }
	public boolean PayWithCreditCard(CreditCard payment) {
    	try {	
    		for (Map.Entry<String, Services> entry : DataBase.getdb1().services.entrySet()) {
        		 if(Objects.equals(entry.getKey().toLowerCase(), payment.getServiceName().toLowerCase()))
        		 {
        			 double dis=0;
        			 for (DiscountDecorator discount : DataBase.getdb1().discounts )  {
        				 if(payment.getServiceName().equals(discount.getsername()))
        					 dis+=discount.getdiscount(); 
        			 }
        			 if(dis!=0) {
        				 
        				 payment.setCost(payment.getCost()-(payment.getCost()*dis));
        		    payment.pay(payment.getCost());
        			 entry.getValue().setCost(payment.getCost());
        			 Transaction t=new Transaction(payment.getServiceName(),payment.getCost(),"payment",false);
        			 DataBase.customerTransactions.put(Transaction.getTransactionId(), t);
        			 }
        			 else
        			 {
        				 entry.getValue().setCost(payment.getCost());
        				  payment.pay(payment.getCost());
             			 Transaction t=new Transaction(payment.getServiceName(),payment.getCost(),"payment",false);
             			 DataBase.customerTransactions.put(Transaction.getTransactionId(), t);
        			 }
        			 return true;

        		 }
        			
        		        	
        	}
    		
    			return false;
    	}catch (Exception e) {
            System.out.println("Exception in pay as" + e.getMessage());
        }
    	

    	return true;
    }
	public boolean PayWithCashe(Cashe payment) {
    	try {	
    		for (Map.Entry<String, Services> entry : DataBase.getdb1().services.entrySet()) {
        		 if(Objects.equals(entry.getKey().toLowerCase(), payment.getServiceName().toLowerCase()))
        		 {
        			 double dis=0;
        			 for (DiscountDecorator discount : DataBase.getdb1().discounts )  {
        				 if(payment.getServiceName().equals(discount.getsername()))
        					 dis+=discount.getdiscount(); 
        			 }
        			 if(dis!=0) {
        				 
        				 payment.setCost(payment.getCost()-(payment.getCost()*dis));
        		    payment.pay(payment.getCost());
        			 entry.getValue().setCost(payment.getCost());
        			 Transaction t=new Transaction(payment.getServiceName(),payment.getCost(),"payment",false);
        			 DataBase.customerTransactions.put(Transaction.getTransactionId(), t);
        			 }
        			 else
        			 {
        				 payment.pay(payment.getCost());
            			 entry.getValue().setCost(payment.getCost());
            			 Transaction t=new Transaction(payment.getServiceName(),payment.getCost(),"payment",false);
            			 DataBase.customerTransactions.put(Transaction.getTransactionId(), t);
        			 }
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
        		     Transaction t=new Transaction("AddToWallet",CreditCard.getFunds(),"wallet",false);
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
}
	
	
