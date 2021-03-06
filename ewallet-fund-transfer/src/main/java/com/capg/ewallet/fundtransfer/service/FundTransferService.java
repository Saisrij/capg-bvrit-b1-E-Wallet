package com.capg.ewallet.fundtransfer.service;

import java.util.List;

import com.capg.ewallet.fundtransfer.model.WalletAccount;
import com.capg.ewallet.fundtransfer.model.WalletTransactions;

public interface FundTransferService {
	public WalletAccount fundtransfer(double amount,WalletAccount fromaccount,WalletAccount toaccount);
    public double showBalanceById(int id);
	
	public List<WalletTransactions> showTransactions();
	
	public WalletAccount getAccountById(int accountId);

}
