package com.example.fawry.model.ProvidersModel;

import java.util.ArrayList;

public abstract class Provider {
	protected String name;
	protected ArrayList <String>fields=new ArrayList<String>();
	protected double amount;
	public Provider() {
		
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
