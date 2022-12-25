package com.example.fawry.service;

import com.example.fawry.model.Account;
import com.example.fawry.model.Response;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.fawry.database.DataBase;
@Service
public class CustomerServices {
    public Boolean SignUP(Account a) {
        try {
        	//String s=a.getUser_name()+a.getEmail();
            if (DataBase.getdb1().cust_accounts.get(a.getEmail()) != null) {
                return false;
            }
            DataBase.getdb1().cust_accounts.put(a.getEmail(), a);
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
}
