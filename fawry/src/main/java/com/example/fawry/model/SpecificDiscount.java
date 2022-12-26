package com.example.fawry.model;


public class SpecificDiscount extends DiscountDecorator  {
	Services service;
	public SpecificDiscount(Services service,double d){
		this.service= service;
		//Services.discount+=d;
	}
	@Override
	public double cost() {
		
		//return service.cost -(service.cost*discount);
		return service.cost;
	}

	@Override
	public void setCost(double cost) {
		service.cost=cost;
		
	}

	@Override
	public String getsername() {
		
		return service.getsername();
	}
/*
	@Override
	public void getDiscountValue() {
		
		Services.finalDiscount+=Services.discount*service.cost;
		
	}

*/
}
