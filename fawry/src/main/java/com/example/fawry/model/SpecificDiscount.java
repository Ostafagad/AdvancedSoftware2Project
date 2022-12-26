package com.example.fawry.model;


public class SpecificDiscount extends DiscountDecorator  {
	Service service;
	public SpecificDiscount(Service service,double d){
		this.service= service;
		Service.discount+=d;
	}
	
	public double cost() {
		
		return service.cost -(service.cost*discount);
	}

	@Override
	public void setCost(double cost) {
		service.cost=cost;
		
	}

	@Override
	public String getsername() {
		
		return service.getsername();
	}

	@Override
	public void getDiscountValue() {
		
		Service.finalDiscount+=Service.discount*service.cost;
		
	}


}
