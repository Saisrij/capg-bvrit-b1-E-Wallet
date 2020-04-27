package com.capg.ewallet.fundtransfer.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

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
	
	public WalletAccount getAccountById(int id) {
		return repo.getOne(id);
	}
	
	public double showBalanceById(int id) {
		WalletAccount account = repo.getOne(id);
		return account.getAccountBalance();
	}

	public List<WalletTransactions> showTransactions() {
		return transactionrepo.findAll();
	}
	
	public WalletTransactions createBasicTransaction() {
		WalletTransactions transaction=new WalletTransactions();
		Random r=new Random();
		LocalDateTime now=LocalDateTime.now();
		int transactionId=r.nextInt(1000);
		transaction.setTransactionId(transactionId);
		transaction.setDateOfTransaction(now);
		return transaction;
		
	}

	public WalletAccount fundtransfer(double amount, WalletAccount fromAccount, WalletAccount toAccount) {
		
		List<WalletTransactions> fromTransactionList=fromAccount.getTransactionHistory();
		List<WalletTransactions> toTransactionList=toAccount.getTransactionHistory();
		
		fromAccount.setAccountBalance(fromAccount.getAccountBalance() - amount);
		toAccount.setAccountBalance(toAccount.getAccountBalance() + amount);
		
		
		WalletTransactions fromTransaction=createBasicTransaction();
		fromTransaction.setDescription("Transaction Successfull: Amount Debited");
		fromTransaction.setAccountBalance(fromAccount.getAccountBalance());
		fromTransaction.setAmount(amount);
		fromTransactionList.add(fromTransaction);
		fromAccount.setTransactionHistory(fromTransactionList);
		
		WalletTransactions toTransaction=createBasicTransaction();
		toTransaction.setTransactionId(fromTransaction.getTransactionId());
		toTransaction.setDescription("Transaction Successfull: Amount Credited");
		toTransaction.setAccountBalance(toAccount.getAccountBalance());
		toTransaction.setAmount(amount);
		toTransactionList.add(toTransaction);
		toAccount.setTransactionHistory(toTransactionList);
		return fromAccount;

	}


}
