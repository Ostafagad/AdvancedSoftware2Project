package com.example.fawry.model.PaymentModel;


public class Cashe implements Payment {
	private double cashValue;
	public double cost;
	public String serviceName;
	@Override
	public void pay(double amount) {
		cashValue-=amount;
		//Form.handler=true;
	}
	

	public double getCashValue() {
		return this.cashValue;
	}
	public void setCashValue(double cash) {
		this.cashValue=cash;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
}
