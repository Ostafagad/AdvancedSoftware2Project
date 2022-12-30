package com.example.fawry.model.ProvidersModel;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
public class Vodafone extends Provider {
	private static Vodafone v=null;
	private Vodafone() {	
	}
	private Vodafone(String name,double amount,ArrayList <String>fields) {
		this.name=name;
		this.amount=amount;
		this.fields=fields;
		
	}
	
	public static Vodafone getvodafone(String name,double amount,ArrayList <String>fields)
	{
		if(v==null)
			v=new Vodafone( name, amount,fields);
		return v;
	}
}
