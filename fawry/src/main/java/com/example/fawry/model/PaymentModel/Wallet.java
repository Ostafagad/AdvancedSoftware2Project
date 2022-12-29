package com.example.fawry.model.PaymentModel;

public class Wallet implements Payment {
	private static double balance=0.0;
	public double cost;
	public String serviceName;

	@Override
	public void pay(double amount) {
		
		balance-=amount;
		//Form.handler=true;
	}
	public static void addfunds(double d)
	{
		
		balance+=d;
	}
	public static double getbalance() {
		return balance;
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
//	

}
