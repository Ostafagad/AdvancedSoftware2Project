package com.example.fawry.model;


public abstract class  LandlineServices extends Services {
	public LandlineServices () {
		
	}
	
	public double cost() {
		
		return this.cost;
	}

//	@Override
//	public void setCost(double cost) {
//		super.cost=cost;
//		
//	}
	public abstract void setlandlinecost();
    
	public String getsername() {
		return this.serviceName;
	}

	/*@Override
	public void getDiscountValue() {
		
		Service.finalDiscount+=0;
	}
	*/
	

}
