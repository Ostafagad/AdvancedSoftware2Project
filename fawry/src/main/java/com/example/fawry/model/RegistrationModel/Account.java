package com.example.fawry.model.RegistrationModel;

import com.example.fawry.model.TransactionModel.Transaction;

public class Account {
	private String user_name;
    private String password;
    private String email;
    public static int custid=0;
     public Account()
     {
    	 Account.custid++;
     }

    public void setEmail(String email) {
        this.email = email;

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUser_name() {
        return user_name;
    }
    public static int getcustId() {
		return Account.custid;
	}
    public String toString() {
		return user_name + "::" + email + "::" + password;
	}



}
