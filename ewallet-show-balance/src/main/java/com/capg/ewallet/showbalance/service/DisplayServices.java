package com.capg.ewallet.showbalance.service;

import java.util.List;

import com.capg.ewallet.showbalance.model.WalletTransactions;

public interface DisplayServices {
	
	public double showBalanceById(int id);
	
	public List<WalletTransactions> showTransactions();

}
