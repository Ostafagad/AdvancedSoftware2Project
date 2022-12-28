package com.example.fawry.service.AdminService;
import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Service;
import com.example.fawry.database.DataBase;

import com.example.fawry.model.DiscountDecorator;


@Service
public class AddDiscount {

	public boolean addDiscount(DiscountDecorator d) {
		  try {
	        	if(DataBase.getdb1().discounts.isEmpty()) {
	    			DataBase.getdb1().discounts.put(d.getDiscountname().toLowerCase(), d);
	    			return true;
	        	}
	        	for (Map.Entry<String, DiscountDecorator> entry : DataBase.getdb1().discounts.entrySet()) {
	        		 if(Objects.equals(entry.getValue().getsername(),d.getsername()) || Objects.equals(entry.getValue().getDiscountname(), d.getDiscountname()) )
	        			return false;
	        		        	
	        	}
				DataBase.getdb1().discounts.put(d.getDiscountname().toLowerCase(), d);
				
	        } catch (Exception e) {
	            System.out.println("Exception in account as" + e.getMessage());
	            return false;
	        }
	        return true;
}
}