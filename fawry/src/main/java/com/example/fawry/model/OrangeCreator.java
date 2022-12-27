package com.example.fawry.model;


public class OrangeCreator extends ProviderCreator {
	@Override
	public Provider creatProvider(String name,double amount) {
		return Orange.getOrange();
	}

}
