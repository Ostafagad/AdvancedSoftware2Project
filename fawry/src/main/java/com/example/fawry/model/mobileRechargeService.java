package com.example.fawry.model;

public class mobileRechargeService extends Service {
	
	public mobileRechargeService () {
		this.description="Mobile Recharge Service";
		this.discount=0;
		
	}
	
	public double cost() {
		
		return this.cost;
	}

	@Override
	public void setCost(double cost) {
		this.cost=cost;
		
	}
    
	public String getsername() {
		return "Mobile Recharge Service";
	}

	@Override
	public void getDiscountValue() {
		
		Service.finalDiscount+=0;
	}
	
}
