package com.example.fawry.model.ProvidersModel;

import java.util.ArrayList;

public class We extends Provider {
private static We v=null;

	private We() {	
	}
	private We(String name,double amount,ArrayList <String>fields) {
    	this.name=name;
		this.amount=amount;
		this.fields=fields;
	}
	public static We getWe(String name,double amount,ArrayList <String>fields)
	{
		if(v==null)
			v=new We(name,amount,fields);
		return v;
	}
}
