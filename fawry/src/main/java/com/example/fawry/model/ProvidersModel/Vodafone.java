package com.example.fawry.model.ProvidersModel;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
public class Vodafone extends Provider {
	private static Vodafone v=null;
	private Vodafone() {
		
		
//		this.fields.add("phone number");
//		this.fields.add("City");
		
	}
	
	private Vodafone(String name,double amount) {
		this.name=name;
		this.amount=amount;
		
//		this.fields.add("phone number");
//		this.fields.add("City");
		
	}
	
	public static Vodafone getvodafone(String name,double amount)
	{
		if(v==null)
			v=new Vodafone( name, amount);
		return v;
	}
	
	public void setForm(ArrayList <String>inputfields,double amount)
	{
//		this.inputfields=inputfields;
		this.amount=amount;
	}
	

}
