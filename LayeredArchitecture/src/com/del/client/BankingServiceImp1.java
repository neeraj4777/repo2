package com.del.client;

import com.del.exception.BankingException;
import com.del.service.BankingService;

public class BankingServiceImp1 implements BankingService {

	@Override
	public void depositAmount(double amount) throws BankingException {
		// TODO Auto-generated method stub

	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getAmount(double amount) throws BankingException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean authenticate(String login, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
