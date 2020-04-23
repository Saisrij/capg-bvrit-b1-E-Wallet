package com.capg.ewallet.addamount.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.ewallet.addamount.model.WalletAccount;
import com.capg.ewallet.addamount.repository.AddAmountRepo;

@Service
public class AddAmountServiceImpl implements AddAmountService {
	
	@Autowired
	AddAmountRepo repo;
	
	public WalletAccount addAmount(double amount,WalletAccount account) {
		WalletAccount acc=repo.getOne(account.getAccountId());
		double newAmount=amount+acc.getAccountBalance();
		acc.setAccountBalance(newAmount);
		return acc;
	}

}
