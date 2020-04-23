package com.capg.ewallet.showbalance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.ewallet.showbalance.model.WalletAccount;
import com.capg.ewallet.showbalance.model.WalletTransactions;
import com.capg.ewallet.showbalance.repository.ShowBalanceRepo;
import com.capg.ewallet.showbalance.repository.ShowTransactionsRepo;

@Service
public class DisplayServicesImpl implements DisplayServices {
	
	@Autowired
	ShowBalanceRepo balanceRepo;
	
	@Autowired
	ShowTransactionsRepo transactionsRepo;
	
	public double showBalanceById(int id) {
		WalletAccount acc=balanceRepo.getOne(id);
		return acc.getAccountBalance();
	}
	
	public List<WalletTransactions> showTransactions(){
		return transactionsRepo.findAll();
	}

}
