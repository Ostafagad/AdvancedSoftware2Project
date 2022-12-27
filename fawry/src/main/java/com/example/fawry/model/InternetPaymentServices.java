package com.example.fawry.model;

public class InternetPaymentServices extends Services{
	public InternetPaymentServices () {
		this.description="Internet Payment Services";
	}
	
	public double cost() {
		
		return this.cost;
	}

	@Override
	public void setCost(double cost) {
		super.cost=cost;
		
	}
    
	public String getsername() {
		return this.description;
	}

	/*@Override
	public void getDiscountValue() {
		
		Service.finalDiscount+=0;
	}
	*/
	
}
