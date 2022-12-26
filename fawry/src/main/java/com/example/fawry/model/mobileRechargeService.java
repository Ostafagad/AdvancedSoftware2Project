package com.example.fawry.model;

public class mobileRechargeService extends Services {
	public mobileRechargeService () {}
	public mobileRechargeService (String description,double cost) {
		
		this.description=description;
		this.cost=cost;
		
	}
	@Override
	public double cost() {
		
		return this.cost;
	}

	@Override
	public void setCost(double cost) {
		this.cost=cost;
		
	}
	public void setsername(String description) {
	 this.description=description;
	}
	@Override
	public String getsername() {
		return this.description;
	}
	
/*
	@Override
	public void getDiscountValue() {
		
		Services.finalDiscount+=0;
	}
	*/
}
