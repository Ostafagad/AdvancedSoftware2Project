package com.example.fawry.database;
import java.util.ArrayList;

import com.example.fawry.model.*;
/**
*
* @author 
*/
public class DataBase {
	private String adminUserName="aaaa";
    private String adminPasswod="123";
    private static DataBase database=null;
    public static ArrayList<Provider> providers;
    private DataBase()
    {
//		this.adminPasswod="123";
//		this.adminUserName="aaaa";
    	providers=new ArrayList<Provider>();
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
