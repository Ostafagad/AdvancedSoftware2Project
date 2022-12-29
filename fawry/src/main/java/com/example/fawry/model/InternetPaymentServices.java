package com.example.fawry.model;

public class InternetPaymentServices extends Services{
	public InternetPaymentServices (String name) {
		this.serviceName=name;
	}
	
	public double cost() {
		
		return this.cost;
	}

	@Override
	public void setCost(double cost) {
		super.cost=cost;
		
	}
    
	public String getsername() {
		return this.serviceName;
	}

	/*@Override
	public void getDiscountValue() {
		
		Service.finalDiscount+=0;
	}
	*/
	
}
