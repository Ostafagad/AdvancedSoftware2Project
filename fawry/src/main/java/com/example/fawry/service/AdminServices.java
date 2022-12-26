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


  public boolean addProvider(Provider p) {
    try {
      if(DataBase.getdb1().providers.get(p.getName().toLowerCase())!=null) {
        return false;
      }
     
        DataBase.getdb1().providers.put(p.getName().toLowerCase(),p);
      
      
    }catch (Exception e) {
            System.out.println("Exception in provider as" + e.getMessage());
            return false;
        }
    return true;
    
  }

  
public boolean addService(Services ser) {
	try {
	      if(DataBase.getdb1().services.get(ser.getsername().toLowerCase())!=null) {
	        return false;
	      }
	     
	        DataBase.getdb1().services.put(ser.getsername().toLowerCase(),ser);
	      
	      
	    }catch (Exception e) {
	            System.out.println("Exception in provider as" + e.getMessage());
	            return false;
	        }
	    return true;
}
}