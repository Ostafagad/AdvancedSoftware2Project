package com.example.fawry.service;
//import com.example.fawry.database.*;
import org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations.Providers;
import org.springframework.stereotype.Service;

import com.example.fawry.database.DataBase;
import com.example.fawry.model.*;
@Service
public class AdminServices {
	public String signIn(String name) {
		 if(name==DataBase.getdb1().getAdminName())
			 return DataBase.getdb1().getAdminName();
		 else
			 return "Wrong password";			 
	 }
public boolean addProvider(ProviderCreator provider) {
	boolean res = false;
		for(Provider p:DataBase.providers) {
			if(provider.creatProvider().getName()==p.getName())
				res=false;
			else
				res=true;
		}
		
		return res;
		
	}
}
