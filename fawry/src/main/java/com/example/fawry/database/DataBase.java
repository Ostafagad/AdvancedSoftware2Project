package com.example.fawry.database;

public class DataBase {
	private String adminUserName;
    private String adminPasswod;
    private static DataBase database=null;
    private DataBase()
    {
		this.adminPasswod="123";
		this.adminUserName="aaaa";
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
