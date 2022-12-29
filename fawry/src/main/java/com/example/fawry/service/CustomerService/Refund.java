package com.example.fawry.service.CustomerService;

import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.example.fawry.database.DataBase;
import com.example.fawry.model.Transaction;

@Service
public class Refund {
public Transaction askForRefund(int transactionId) {
		
		try {	
    		for (Map.Entry<Integer,Transaction> entry : DataBase.getdb1().customerTransactions.entrySet()) {
        		 if(Objects.equals(entry.getKey(), transactionId))
        		 {
        		    
        			 DataBase.refunds.put(entry.getKey(), entry.getValue());
        			 return entry.getValue();
        		 }		
        		        	
        	}
    		
    			return null;
    	}catch (Exception e) {
            System.out.println("Exception in pay as" + e.getMessage());
        }
		return null;
	}

public boolean CheckRefund(int transactionId) {
	
	try {	
		for (Map.Entry<Integer,Transaction> entry : DataBase.getdb1().customerTransactions.entrySet()) {
    		 if(Objects.equals(entry.getKey(), transactionId)&& entry.getValue().isRefundStatus())
    		 {
    		    
    			 
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

