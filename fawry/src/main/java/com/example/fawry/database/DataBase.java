package com.example.fawry.database;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

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
    public static ArrayList<Provider> providers;
    public static Map<String, Account> cust_accounts = new HashMap<String, Account>();
    public static Queue<Transaction>refunds;
    public static ArrayList<Transaction>customerTransactions;
    public static ArrayList <Service> services; 
    private DataBase()
    {
//		this.adminPasswod="123";
//		this.adminUserName="aaaa";
    	providers=new ArrayList<Provider>();
    	refunds= new  LinkedList<Transaction>();
    	services=new ArrayList<Service>();
    }
    public static DataBase getdb()
    {
    	if(database==null)
    		database=new DataBase();
    	return database;
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
