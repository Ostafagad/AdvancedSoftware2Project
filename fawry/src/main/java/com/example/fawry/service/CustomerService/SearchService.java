package com.example.fawry.service.CustomerService;

import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.example.fawry.database.DataBase;
import com.example.fawry.model.Services;

@Service
public class SearchService {
	 public Services SearchServices(String description) {
	        try {
//	          Account a=DataBase.getdb1().cust_accounts.get(em);
//	          if(a.getPassword()==pass)
	        	for (Map.Entry<String, Services> entry :  DataBase.getdb1().services.entrySet()) {
	        		if(DataBase.getdb1().services.isEmpty())
	        			return null;
	        		else if(Objects.equals(entry.getKey().toLowerCase(), description.toLowerCase())  )
	        			return entry.getValue();	        	
	        	}
	        	////
	  

	            
//	          for (Map.Entry<String, Account> entry : DataBase.getdb1().cust_accounts.entrySet()) {
//	            if(entry.getKey()==em)
//	            {
//	              return DataBase.getdb1().cust_accounts.get(em);
//	            }
//	          }
	           
	        } catch (Exception e) {
	            System.out.println("Exception in getCustomer as" + e.getMessage());
	        }
	        return null;
	    }
}
