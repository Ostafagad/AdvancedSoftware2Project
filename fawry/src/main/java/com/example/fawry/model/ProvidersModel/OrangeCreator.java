package com.example.fawry.model.ProvidersModel;


public class OrangeCreator extends ProviderCreator {
	@Override
	public Provider creatProvider(String name,double amount) {
		return Orange.getOrange();
	}

}
