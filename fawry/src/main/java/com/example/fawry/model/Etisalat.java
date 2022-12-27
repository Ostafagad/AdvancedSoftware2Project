package com.example.fawry.model;


public class Etisalat extends Provider {
private static Etisalat v=null;

	
	private Etisalat() {
		
	}
    private Etisalat(String name,double amount) {
    	this.name=name;
		this.amount=amount;
	}
	public static Etisalat getEtisalat()
	{
		if(v==null)
			v=new Etisalat();
		return v;
	}
	
	public void setForm(double amount)
	{
		//super.inputfields=inputfields;
		super.amount=amount;
	}
	


}
