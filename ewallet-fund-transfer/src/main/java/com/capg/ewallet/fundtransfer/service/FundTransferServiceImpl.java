package com.capg.ewallet.fundtransfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.ewallet.fundtransfer.model.WalletAccount;
import com.capg.ewallet.fundtransfer.model.WalletTransactions;
import com.capg.ewallet.fundtransfer.repository.DisplayTransactionsRepo;
import com.capg.ewallet.fundtransfer.repository.FundTransferRepo;

public class FundTransferServiceImpl implements FundTransferService {
	@Autowired
	FundTransferRepo repo;
	@Autowired
	DisplayTransactionsRepo transactionrepo;
	
	public double showBalanceById(int id) {
		WalletAccount account = repo.getOne(id);
		return account.getAccountBalance();
	}

	public List<WalletTransactions> showTransactions() {
		return transactionrepo.findAll();
	}

	public WalletAccount fundtransfer(double amount, WalletAccount fromaccount, WalletAccount toaccount) {
		WalletAccount account1 = repo.getOne(fromaccount.getAccountId());
		WalletAccount account2 = repo.getOne(toaccount.getAccountId());
		fromaccount.setAccountBalance(fromaccount.getAccountBalance() - amount);
		toaccount.setAccountBalance(toaccount.getAccountBalance() + amount);
		WalletTransactions fromtransaction;
		fromtransaction.setTransactionId(1001);
		fromtransaction.setDescription("Transaction Successfull");
		fromtransaction.setDateOfTransaction();
		fromtransaction.setAccountBalance();
		fromtransaction.setAmount(amount);
		fromaccount.setTransactionHistory();
		WalletTransactions totransaction;
		totransaction.setTransactionId(1001);
		totransaction.setDescription("Transaction Successfull");
		totransaction.setDateOfTransaction();
		totransaction.setAccountBalance();
		totransaction.setAmount(amount);
		toaccount.setTransactionHistory();
		return toaccount;

	}


}
