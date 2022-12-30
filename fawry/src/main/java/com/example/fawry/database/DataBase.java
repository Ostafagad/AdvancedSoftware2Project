package com.example.fawry.database;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Vector;

import org.springframework.stereotype.Component;

import com.example.fawry.model.*;
import com.example.fawry.model.DiscountModel.DiscountDecorator;
import com.example.fawry.model.ProvidersModel.Provider;
import com.example.fawry.model.RegistrationModel.Account;
import com.example.fawry.model.ServiceModel.Donations;
import com.example.fawry.model.ServiceModel.InternetPaymentServices;
import com.example.fawry.model.ServiceModel.MonthlyReceipt;
import com.example.fawry.model.ServiceModel.QuarterReceipt;
import com.example.fawry.model.ServiceModel.Services;
import com.example.fawry.model.ServiceModel.mobileRechargeService;
import com.example.fawry.model.TransactionModel.Transaction;
/**
*
* @author 
*/
@Component

public class DataBase {
	private String adminUserName="admin";
    private String adminPasswod="12345";
    private static DataBase database=null;
    public static Map<String, Provider> providers = new HashMap<String, Provider>();
    public static Vector<DiscountDecorator> discounts=new Vector<>();
    public static Map<String, Account> cust_accounts = new HashMap<String, Account>();
    public static Map<Integer,Transaction>refunds=new HashMap<Integer,Transaction>();
    public static Map<Integer,Transaction>customerTransactions=new HashMap<Integer,Transaction>();
    public static Map<String, Services> services = new HashMap<String, Services>();
    
       private DataBase()
    {
    	   Services service1=new InternetPaymentServices("InternetPayment");
    	   Services service2=new  mobileRechargeService("mobileRecharge");
    	   Services service3=new QuarterReceipt("QuarterReceipt");
    	   Services service4=new MonthlyReceipt("MonthlyReceipt");
    	   Services service5=new Donations("Donations");
    	   services.put("Donations", service5);
    	   services.put("InternetPayment", service1);
    	   services.put(" mobileRecharge", service2);
    	   services.put("QuarterReceipt", service3);
    	   services.put("MonthlyReceipt", service4);
    	
    }
   
    
    public void setAdminUserName(String name) {
		this.adminUserName=name;
	}
    public void setAdminPassword(String pass) {
		this.adminPasswod=pass;
	}
    public String getAdminName() {
    	return this.adminUserName;
    }
    
    public String getAdminPassword() {
    	return this.adminPasswod;
    }
    public static DataBase getdb1()
    {
    	if(database==null)
    		database=new DataBase();
    	return database;
    }
}
