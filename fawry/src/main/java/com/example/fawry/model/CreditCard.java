package com.example.fawry.model;


public class CreditCard implements Payment {
	private String cardnumber;
	private String password;
	private double cardBalance;
	public double cost;
	public String serviceName;
	@Override
	public void pay(double amount) {
		cardBalance-=amount;
		//Form.handler=true;
		
	}
	public void setcardinfo(String num,String pass)
	{
		this.cardnumber=num;
		this.password=pass;
	}
	public String getcardnum()
	{
		return cardnumber;
	}
	public String getpass()
	{
		return password;
	}
	@Override
	public void addfunds(double d) {
		cardBalance+=d;
	}
	public double getCardBalance() {
		return this.cardBalance;
	}
	
	public void setCardBalance(double cardBalance) {
		this.cardBalance=cardBalance;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
}
