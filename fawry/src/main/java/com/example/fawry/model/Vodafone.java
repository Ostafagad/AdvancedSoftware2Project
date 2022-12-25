package com.example.fawry.model;

import java.util.ArrayList;

public class Vodafone extends Provider {
	private static Vodafone v=null;

	
	private Vodafone() {
		
		this.name="Vodafone";
//		this.fields.add("phone number");
//		this.fields.add("City");
		
	}
	public static Vodafone getvodafone()
	{
		if(v==null)
			v=new Vodafone();
		return v;
	}
	
	public void setForm(ArrayList <String>inputfields,double amount)
	{
//		this.inputfields=inputfields;
		this.amount=amount;
	}
	

	

}
