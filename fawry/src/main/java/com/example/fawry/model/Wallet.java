package com.example.fawry.model;

public class Wallet implements Payment {
	private double balance=10000;
	public double cost;
	public String serviceName;
	@Override
	public void pay(double amount) {
		
		balance-=amount;
		//Form.handler=true;
	}
	public void addfunds(double d)
	{
		balance+=d;
	}
	public double getbalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
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
