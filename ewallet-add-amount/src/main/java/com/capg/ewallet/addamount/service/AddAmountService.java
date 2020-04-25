package com.capg.ewallet.addamount.service;

import com.capg.ewallet.addamount.model.WalletAccount;

public interface AddAmountService {
	
	public WalletAccount addAmount(double amount,WalletAccount account);
	public WalletAccount getAccountById(int id);

}
