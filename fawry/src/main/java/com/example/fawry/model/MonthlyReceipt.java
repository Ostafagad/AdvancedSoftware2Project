package com.example.fawry.model;


public class MonthlyReceipt extends LandlineServices {

	@Override
	public void setlandlinecost() {
		this.cost=cost*1;
		
	}

	@Override
	public void setCost(double cost) {
		this.cost=cost;
	}
	
}
