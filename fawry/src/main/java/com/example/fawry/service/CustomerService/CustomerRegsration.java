package com.example.fawry.service.CustomerService;

import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.example.fawry.database.DataBase;
import com.example.fawry.model.RegistrationModel.Account;


@Service
public class CustomerRegsration {
	public Boolean SignUP(Account a) {
        try {
        	if(DataBase.getdb1().cust_accounts.isEmpty()) {
    			DataBase.getdb1().cust_accounts.put(a.getEmail().toLowerCase(), a);
    			return true;
        	}
        	for (Map.Entry<String, Account> entry : DataBase.getdb1().cust_accounts.entrySet()) {
        		 if(Objects.equals(entry.getValue().getUser_name(),a.getUser_name()) || Objects.equals(entry.getValue().getEmail(), a.getEmail()) )
        			return false;
        		        	
        	}
			DataBase.getdb1().cust_accounts.put(a.getEmail().toLowerCase(), a);
			Account acc=new Account();

 
        } catch (Exception e) {
            System.out.println("Exception in account as" + e.getMessage());
            return false;
        }
        return true;
    }
    public Account SignIn(String em,String pass) {
        try {	
        	for (Map.Entry<String, Account> entry : DataBase.getdb1().cust_accounts.entrySet()) {
        		if(DataBase.getdb1().cust_accounts.isEmpty())
        			return null;
        		else if(Objects.equals(entry.getValue().getPassword(), pass) && Objects.equals(entry.getValue().getEmail(), em) )
        			return entry.getValue();
        		        	
        	}
           
        } catch (Exception e) {
            System.out.println("Exception in getCustomer as" + e.getMessage());
        }
        return null;
    }
}
