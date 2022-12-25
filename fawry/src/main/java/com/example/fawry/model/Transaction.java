package com.example.fawry.model;

public class Transaction {
    private int custid;
    private String sername; 
    private double amountpaid;
    public static int transid=0;
	public Transaction(int custid,double amountpaid) {
		Transaction.transid++;
		this.custid=custid;
		//this.sername=sername;
		this.amountpaid=amountpaid;
	}
	public static int gettranid() {
		return transid;
	}
	public double getamount() {
		return this.amountpaid;
	}
	
	public int getcustid() {
		return custid;
	}
	public String getservicename() {
		return this.sername;
	}
}
