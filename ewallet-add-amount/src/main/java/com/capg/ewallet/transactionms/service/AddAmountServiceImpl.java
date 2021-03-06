package com.capg.ewallet.transactionms.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.ewallet.transactionms.model.WalletAccount;
import com.capg.ewallet.transactionms.repository.AddAmountRepo;

@Service
public class AddAmountServiceImpl implements AddAmountService {
	
	@Autowired
	AddAmountRepo repo;
	
	@Transactional
	public WalletAccount addAmount(double amount,WalletAccount account) {
		WalletAccount acc=repo.getOne(account.getAccountId());
		double newAmount=amount+acc.getAccountBalance();
		acc.setAccountBalance(newAmount);
		return acc;
	}
	
	@Transactional
	public WalletAccount getAccountById(int id) {
		return repo.getOne(id);
	}

}
