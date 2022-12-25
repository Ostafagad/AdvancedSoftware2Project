package com.example.fawry.service;
//import com.example.fawry.database.*;
import org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations.Providers;
import org.springframework.stereotype.Service;

import com.example.fawry.database.DataBase;
import com.example.fawry.model.*;
@Service
public class AdminServices {
	private boolean res;
	public String signIn(String name) {
		 if(name==DataBase.getdb1().getAdminName())
			 return DataBase.getdb1().getAdminName();
		 else
			 return "Wrong password";			 
	 }
public boolean addProvider(Provider provider) {
	
		for(Provider p:DataBase.providers) {
			if(DataBase.providers.isEmpty()) {
				DataBase.providers.add(provider);
				this.res=true;
			}
				
			else if(provider.getName()==p.getName()) {
				this.res=false;
			}
				
			else {
				DataBase.providers.add(provider);
				this.res=true;
			}
				
		}
		
		return this.res;	
	}
}
