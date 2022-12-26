package com.example.fawry.service;
//import com.example.fawry.database.*;
import org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations.Providers;
import org.springframework.stereotype.Service;

import com.example.fawry.database.DataBase;
import com.example.fawry.model.*;
@Service
public class AdminServices {
	private boolean res;
	ProviderCreator pc=new VodafoneCreator();
	public String signIn(String name) {
		 if(name==DataBase.getdb1().getAdminName())
			 return DataBase.getdb1().getAdminName();
		 else
			 return "Wrong password";			 
	 }
//public boolean addProvider(Provider provider) {
//	
//		for(Provider p:DataBase.providers) {
//			if(DataBase.providers.isEmpty()) {
//				DataBase.providers.add(provider);
//				this.res=true;
//			}
//				
//			else if(provider.getName()==p.getName()) {
//				this.res=false;
//			}
//				
//			else {
//				DataBase.providers.add(provider);
//				this.res=true;
//			}
//				
//		}
//		return this.res;	
//	}

	public boolean addProvider(String name,double amount) {
		try {
			if(DataBase.getdb1().providers.get(name)!=null)
				return false;
			if(name=="Vodafone" || name=="vodafone") {
				DataBase.getdb1().providers.put(name,pc.creatProvider(name, amount) );	
			}
		}catch (Exception e) {
            System.out.println("Exception in provider as" + e.getMessage());
            return false;
        }
		return true;
		
	}
}
	
// public boolean addService(com.example.fawry.model.Service service) {
//	boolean res=false;
//	for(com.example.fawry.model.Service ser:DataBase.getdb().services) {
//		if(DataBase.getdb1().services.isEmpty()) {
//			DataBase.getdb1().services.add((com.example.fawry.model.Service) service);			
//			res= true;
//		}
//		if(ser==service)
//			res= false;
//		else
//		{
//			DataBase.getdb().services.add((com.example.fawry.model.Service) service);			
//			res= true;
//		}
//	}
//	
//	return res;
//}
//}
