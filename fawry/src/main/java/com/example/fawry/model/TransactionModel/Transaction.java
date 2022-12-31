package com.example.fawry.model.TransactionModel;

public class Transaction {
    private int custid;
    private String sername;
    private String type;
    private double amount;
    public static int transid=0;
    private boolean refundStatus;
	public Transaction(String sername,double amount,String type) {
		Transaction.transid++;
		this.type=type;
		this.sername=sername;
		this.amount=amount;
		this.refundStatus=false;
	}
	public static int gettranid() {
		return transid;
	}
	public double getamount() {
		return this.amount;
	}
	
	public int getcustid() {
		return custid;
	}
	public String getservicename() {
		return this.sername;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static int getTransactionId() {
		return Transaction.transid;
	}
	public boolean isRefundStatus() {
		return refundStatus;
	}
	public void setRefundStatus(boolean refundStatus) {
		this.refundStatus = refundStatus;
	}
}
