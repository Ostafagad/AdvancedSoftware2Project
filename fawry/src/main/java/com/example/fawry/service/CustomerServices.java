package com.example.fawry.service;

import com.example.fawry.model.Account;

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
}
