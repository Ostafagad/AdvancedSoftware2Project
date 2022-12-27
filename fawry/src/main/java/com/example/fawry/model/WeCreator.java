package com.example.fawry.model;


public class WeCreator extends ProviderCreator{
	@Override
	public Provider creatProvider(String name,double amount) {
		return We.getWe();
	}

}
