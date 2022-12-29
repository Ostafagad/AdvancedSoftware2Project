package com.example.fawry.service.AdminService;

import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.example.fawry.database.DataBase;
import com.example.fawry.model.RegistrationModel.Account;

@Service
public class AdminRegistration {
	public Boolean SignUP(Account a) {
        try {
        	if(DataBase.getdb1().admin_account.isEmpty()) {
    			DataBase.getdb1().admin_account.put(a.getEmail().toLowerCase(), a);
    			return true;
        	}
        	for (Map.Entry<String, Account> entry : DataBase.getdb1().admin_account.entrySet()) {
        		 if(Objects.equals(entry.getValue().getUser_name(),a.getUser_name()) || Objects.equals(entry.getValue().getEmail(), a.getEmail()) )
        			return false;
        		        	
        	}
			DataBase.getdb1().admin_account.put(a.getEmail().toLowerCase(), a);

        	///////
        	
//            if (DataBase.getdb1().cust_accounts.get(a.getEmail().toLowerCase()) != null) {
//                return false;
//            }
//            DataBase.getdb1().cust_accounts.put(a.getEmail().toLowerCase(), a);
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
    			//return DataBase.getdb1().cust_accounts.get(em);

        		
        	for (Map.Entry<String, Account> entry : DataBase.getdb1().admin_account.entrySet()) {
        		if(DataBase.getdb1().admin_account.isEmpty())
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
