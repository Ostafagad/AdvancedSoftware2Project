package com.example.fawry.model;

import com.example.fawry.database.DataBase;

public class AskforRefund implements BaseCommand{

	@Override
	public void execute(Transaction t) {
		DataBase.getdb1().refunds.add(t);
	}

}
