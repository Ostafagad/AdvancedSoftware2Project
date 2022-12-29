package com.example.fawry.service.AdminService;

import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.example.fawry.database.DataBase;
import com.example.fawry.model.DiscountDecorator;
import com.example.fawry.model.Services;
import com.example.fawry.model.Transaction;
import com.example.fawry.model.Wallet;

@Service
public class RefundRequestService {
	public boolean acceptRefund(int id) {
		try {
		for (Map.Entry<Integer,Transaction> entry : DataBase.getdb1().refunds.entrySet()) {
   		 if(Objects.equals(entry.getKey(), id))
   		 {
   			 entry.getValue().setRefundStatus(true);
   			 Wallet.addfunds(entry.getValue().getamount());
   			 DataBase.getdb1().refunds.remove(id);
   			 return true;
   		 }
   			   		        	
   	}			return false;
	}catch (Exception e) {
       System.out.println("Exception in pay as" + e.getMessage());
   }
	

	return true;
	}
	
	public boolean rejectRefund(int id) {
		try {
		for (Map.Entry<Integer,Transaction> entry : DataBase.getdb1().refunds.entrySet()) {
   		 if(Objects.equals(entry.getKey(), id))
   		 {
   			 entry.getValue().setRefundStatus(false);
   			DataBase.getdb1().refunds.remove(id);
   			 return true;
   		 }
   			   		        	
   	}			return false;
	}catch (Exception e) {
       System.out.println("Exception in pay as" + e.getMessage());
   }
	

	return true;
	}
	
	
}
