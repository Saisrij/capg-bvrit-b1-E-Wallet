package com.capg.ewallet.transactionms.service;

import com.capg.ewallet.transactionms.model.WalletAccount;

public interface AddAmountService {
	
	public WalletAccount addAmount(double amount,WalletAccount account);
	public WalletAccount getAccountById(int id);

}
