package com.example.fawry.service;

import org.springframework.stereotype.Service;

import com.example.fawry.database.DataBase;

@Service
public class AdminServices {
	public String signIn(String name) {
		 if(name==DataBase.getdb1().getAdminName())
			 return DataBase.getdb1().getAdminName();
		 else
			 return "False ";			 
	 }
}
