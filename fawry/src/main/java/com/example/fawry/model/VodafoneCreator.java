package com.example.fawry.model;

public class VodafoneCreator extends ProviderCreator {

	@Override
	public Provider creatProvider() {
		return Vodafone.getvodafone();
	}

}
