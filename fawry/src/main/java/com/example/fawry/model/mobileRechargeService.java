package com.example.fawry.model;

public class mobileRechargeService extends Services {
	public mobileRechargeService () {}
	public mobileRechargeService (String description) {
		
		this.serviceName=description;
		
		
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
	 this.serviceName=description;
	}
	@Override
	public String getsername() {
		return this.serviceName;
	}
	
/*
	@Override
	public void getDiscountValue() {
		
		Services.finalDiscount+=0;
	}
	*/
}
