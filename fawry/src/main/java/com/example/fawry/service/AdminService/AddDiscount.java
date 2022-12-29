package com.example.fawry.service.AdminService;
import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Service;
import com.example.fawry.database.DataBase;
import com.example.fawry.model.DiscountModel.DiscountDecorator;



@Service
public class AddDiscount {

	public boolean addDiscount(DiscountDecorator d) {
		  
			  try {
		        	if(DataBase.getdb1().discounts.isEmpty()) {
		    			DataBase.getdb1().discounts.add(d);
		    			return true;
		        	}
		        	for (DiscountDecorator entry : DataBase.getdb1().discounts ) {
		        		 if(entry.getsername().toLowerCase().equals(d.getsername().toLowerCase()) && entry.getDiscountname().toLowerCase().equals(d.getDiscountname().toLowerCase())) 
		        		 {  
		        			 return false;
		        		 }
		        	}
		        	DataBase.getdb1().discounts.add(d);
					
		        } catch (Exception e) {
		            System.out.println("Exception in account as" + e.getMessage());
		            return false;
		        }
		        return true;
}
}