package com.example.fawry.service.AdminService;

import org.springframework.stereotype.Service;

import com.example.fawry.database.DataBase;
@Service
public class AdminRegistration {
	public String signIn(String name) {
	     if(name==DataBase.getdb1().getAdminName())
	       return DataBase.getdb1().getAdminName();
	     else
	       return "Wrong password";       
	   }
}
