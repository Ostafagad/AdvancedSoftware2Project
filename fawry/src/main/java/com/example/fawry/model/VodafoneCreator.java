package com.example.fawry.model;

public class VodafoneCreator extends ProviderCreator {

	@Override
	
	public Provider creatProvider(String name,double amount) {
		return Vodafone.getvodafone( name, amount);
	}

}
