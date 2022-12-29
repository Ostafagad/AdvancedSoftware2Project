package com.example.fawry.model.ProvidersModel;

public class We extends Provider {
private static We v=null;

	
	private We() {	
	}
	private We(String name,double amount) {
    	this.name=name;
		this.amount=amount;
	}
	public static We getWe()
	{
		if(v==null)
			v=new We();
		return v;
	}
	
	public void setForm(double amount)
	{
		//super.inputfields=inputfields;
		super.amount=amount;
	}
	
}
