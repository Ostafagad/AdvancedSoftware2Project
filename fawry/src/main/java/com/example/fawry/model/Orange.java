package com.example.fawry.model;

import org.springframework.stereotype.Component;

@Component
public class Orange extends Provider {
private static Orange v=null;

	
	private Orange() {	
	}
	private Orange(String name,double amount) {
		this.name=name;
		this.amount=amount;
	}
	public static Orange getOrange()
	{
		if(v==null)
			v=new Orange();
		return v;
	}
	/*
	public void setForm(ArrayList <String>inputfields,double amount)
	{
		super.inputfields=inputfields;
		super.amount=amount;
	}
	
*/
	


}
