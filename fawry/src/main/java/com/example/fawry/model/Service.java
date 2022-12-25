package com.example.fawry.model;



public abstract class Service {
	protected double cost;
	public String description;
	public abstract double cost();
	public abstract void setCost(double cost);
	public abstract String getsername();
	public abstract void getDiscountValue();
	protected static double finalDiscount=0;	
	protected static double discount;


}
