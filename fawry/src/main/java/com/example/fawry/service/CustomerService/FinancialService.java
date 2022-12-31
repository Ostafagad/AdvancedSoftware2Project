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
    		
        		 if( DataBase.getdb1().validatepayment( payment)!=null) 
        		 {
        			 double dis=0;
        			 for (DiscountDecorator discount : DataBase.getdb1().discounts )  {
        				 if(payment.getServiceName().equals(discount.getsername()))
        					 dis+=discount.getdiscount(); 
        			 }
        			 if(dis!=0) {
        				 
        				 payment.setCost(payment.getCost()-(payment.getCost()*dis));
  
        		    payment.pay(payment.getCost());
        		    DataBase.getdb1().validatepayment( payment).setCost(payment.getCost());
        			 Transaction t=new Transaction(payment.getServiceName(),payment.getCost(),"payment");
        			 payment.setTransactionId(Transaction.getTransactionId());
        			 DataBase.customerTransactions.put(Transaction.getTransactionId(), t);
        			 }
        			 else
        			 {
        				  payment.pay(payment.getCost());
        				  DataBase.getdb1(). validatepayment( payment).setCost(payment.getCost());
             			 Transaction t=new Transaction(payment.getServiceName(),payment.getCost(),"payment");
             			 DataBase.customerTransactions.put(Transaction.getTransactionId(), t);
            			 payment.setTransactionId(Transaction.getTransactionId());

        			 
        			 }
        			 return true;
        		 }
        			
        		        	
        	
    	
    			return false;
    	}catch (Exception e) {
            System.out.println("Exception in pay as" + e.getMessage());
        }
    	return true;
    }

	public boolean PayWithCreditCard(CreditCard payment) {
		try {	
    		for (Services entry :  DataBase.getdb1().providersServices){
        		 if(entry.getserviceName().toLowerCase().equals(payment.getServiceName().toLowerCase())&&
        				 entry.getServiceProvider().toLowerCase().equals(payment.getProviderName().toLowerCase())) 
        		 {
        			 double dis=0;
        			 for (DiscountDecorator discount : DataBase.getdb1().discounts )  {
        				 if(payment.getServiceName().equals(discount.getsername()))
        					 dis+=discount.getdiscount(); 
        			 }
        			 if(dis!=0) {
        				 
        			payment.setCost(payment.getCost()-(payment.getCost()*dis));
        		    payment.pay(payment.getCost());
        			 entry.setCost(payment.getCost());
        			 Transaction t=new Transaction(payment.getServiceName(),payment.getCost(),"payment");
        			 DataBase.customerTransactions.put(Transaction.getTransactionId(), t);
        			 payment.setTransactionId(Transaction.getTransactionId());

        			 }
        			 else
        			 {
        				 entry.setCost(payment.getCost());
        				  payment.pay(payment.getCost());
             			 Transaction t=new Transaction(payment.getServiceName(),payment.getCost(),"payment");
             			 DataBase.customerTransactions.put(Transaction.getTransactionId(), t);
            			 payment.setTransactionId(Transaction.getTransactionId());

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
    		for (Services entry :  DataBase.getdb1().providersServices){
        		 if(entry.getserviceName().toLowerCase().equals(payment.getServiceName().toLowerCase())&&
        				 entry.getServiceProvider().toLowerCase().equals(payment.getProviderName().toLowerCase())) 
        		 {
        			 double dis=0;
        			 for (DiscountDecorator discount : DataBase.getdb1().discounts )  {
        				 if(payment.getServiceName().equals(discount.getsername()))
        					 dis+=discount.getdiscount(); 
        			 }
        			 if(dis!=0) {
        				 
        				 payment.setCost(payment.getCost()-(payment.getCost()*dis));
        		    payment.pay(payment.getCost());
        			 entry.setCost(payment.getCost());
        			 Transaction t=new Transaction(payment.getServiceName(),payment.getCost(),"payment");
        			 DataBase.customerTransactions.put(Transaction.getTransactionId(), t);
        			 payment.setTransactionId(Transaction.getTransactionId());

        			 }
        			 else
        			 {
        				 payment.pay(payment.getCost());
            			 entry.setCost(payment.getCost());
            			 Transaction t=new Transaction(payment.getServiceName(),payment.getCost(),"payment");
            			 DataBase.customerTransactions.put(Transaction.getTransactionId(), t);
            			 payment.setTransactionId(Transaction.getTransactionId());

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
        		     Transaction t=new Transaction("AddToWallet",CreditCard.getFunds(),"wallet");
        			 DataBase.customerTransactions.put(Transaction.getTransactionId(), t);
        			 card.setTransactionId(Transaction.getTransactionId());

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
	
	
