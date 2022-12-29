package com.example.fawry.model;

public class Wallet implements Payment {
	private static double balance=0.0;
	public double cost;
	public String serviceName;
	private static double funds=0.0;
	@Override
	public void pay(double amount) {
		
		balance-=amount;
		//Form.handler=true;
	}
	public void addfunds(double d)
	{
		
		balance+=funds;
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
	public static double getFunds() {
		return funds;
	}
	public void setFunds(double funds) {
		this.funds = funds;
	}

}
