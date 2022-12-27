package com.example.fawry.model;


public class QuarterReceipt extends LandlineServices {
	@Override
	public void setlandlinecost() {
		this.cost=cost*3;
		
	}

	@Override
	public void setCost(double cost) {
		this.cost=cost*3;
	}

}
