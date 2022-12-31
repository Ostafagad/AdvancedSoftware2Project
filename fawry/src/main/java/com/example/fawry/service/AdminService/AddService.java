package com.example.fawry.service.AdminService;

import org.springframework.stereotype.Service;

import com.example.fawry.database.DataBase;
import com.example.fawry.model.ServiceModel.Services;

@Service
public class AddService {
	public boolean addService(Services ser) {
		try {
		      if(DataBase.getdb1().services.get(ser.getserviceName().toLowerCase())!=null) {
		        return false;
		      }
		     
		        DataBase.getdb1().services.put(ser.getserviceName().toLowerCase(),ser);
		      
		      
		    }catch (Exception e) {
		            System.out.println("Exception in provider as" + e.getMessage());
		            return false;
		        }
		    return true;
	}
}
