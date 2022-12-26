package com.example.fawry.model;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class ProviderCreator {
	
	public abstract Provider creatProvider(String name,double amount);
}