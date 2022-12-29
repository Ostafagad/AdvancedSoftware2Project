package com.example.fawry.database;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Vector;

import org.springframework.stereotype.Component;

import com.example.fawry.model.*;
/**
*
* @author 
*/
@Component

public class DataBase {
	private String adminUserName="aaaa";
    private String adminPasswod="123";
    private static DataBase database=null;
    public static Map<String, Provider> providers = new HashMap<String, Provider>();
    public static Vector<DiscountDecorator> discounts=new Vector<>();

    public static Map<String, Account> cust_accounts = new HashMap<String, Account>();
    public static Map<String, Account> admin_account = new HashMap<String, Account>();
    public static Queue<Transaction>refunds;
    public static ArrayList<Transaction>customerTransactions;
    public static Map<String, Services> services = new HashMap<String, Services>();
    public static Map<String, DiscountDecorator> discounts = new HashMap<String,  DiscountDecorator>();
    private DataBase()
    {
//		this.adminPasswod="123";
//		this.adminUserName="aaaa";
    	
    	refunds= new  LinkedList<Transaction>();
    	
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
