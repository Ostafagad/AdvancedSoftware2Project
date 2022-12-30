package com.example.fawry.model.ProvidersModel;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Orange extends Provider {
private static Orange v=null;
	private Orange() {	
	}
	private Orange(String name,double amount,ArrayList <String>fields) {
		this.name=name;
		this.amount=amount;
		this.fields=fields;
	}
	public static Orange getOrange(String name,double amount,ArrayList <String>fields)
	{
		if(v==null)
			v=new Orange(name,amount,fields);
		return v;
	}
}
