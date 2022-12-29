package com.example.fawry.model.ProvidersModel;


public class EtisalatCreator extends ProviderCreator {
	@Override
	public Provider creatProvider(String name,double amount) {
		return Etisalat.getEtisalat();
	}

}
