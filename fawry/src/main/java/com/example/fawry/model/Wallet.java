package com.example.fawry.model;

public class Wallet implements Payment {
	private double balance=10000;

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

}
