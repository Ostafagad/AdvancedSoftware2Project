package com.example.fawry.model.ProvidersModel;

import java.util.ArrayList;

public abstract class Provider {
	
	
	//protected Form form;
	protected String name;
//	protected ArrayList <String>fields;
	protected double amount;
//	protected ArrayList <String>inputfields;
	public Provider() {
		//services=new ArrayList<Service>();
		//fields=new ArrayList<String>();
		//form=new Form(inputfields,amount);
		//inputfields=new ArrayList<String>();
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setAmount(double amount) {
		this.amount=amount;
	}
	
	public double getAmount() {
		return this.amount;
	}
}
