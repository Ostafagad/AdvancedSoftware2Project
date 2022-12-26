package com.example.fawry.model;

import java.util.ArrayList;
public class Customer {
	private String user_name;
    private String password;
    private  String email;
    private Account acount;
    private Payment payment;
    //private ProviderCreator pc;
    private Services ser;
    private double cost;
    private ArrayList<Transaction>transactions;
    public static int custid=0;
    private BaseCommand bc;
    private ProviderCreator pc;
    private String targetService;
    private Transaction t;
    public Customer() {	
    	Customer.setCustid(Customer.getCustid() + 1);
    	
    }
    
    
   
   
public Account getAcount() {
	return acount;
}



public void setAcount(Account acount) {
	this.acount = acount;
}



public Payment getPayment() {
	return payment;
}



public void setPayment(Payment payment) {
	this.payment = payment;
}



public Services getSer() {
	return ser;
}



public void setSer(Services ser) {
	this.ser = ser;
}



public ProviderCreator getPc() {
	return pc;
}



public void setPc(ProviderCreator pc) {
	this.pc = pc;
}



public static int getCustid() {
	return custid;
}



public static void setCustid(int custid) {
	Customer.custid = custid;
}



public BaseCommand getBc() {
	return bc;
}



public void setBc(BaseCommand bc) {
	this.bc = bc;
}



public Transaction getT() {
	return t;
}



public void setT(Transaction t) {
	this.t = t;
}




public ArrayList<Transaction> getTransactions() {
	return transactions;
}




public void setTransactions(ArrayList<Transaction> transactions) {
	this.transactions = transactions;
}




public double getCost() {
	return cost;
}




public void setCost(double cost) {
	this.cost = cost;
}
  
}
