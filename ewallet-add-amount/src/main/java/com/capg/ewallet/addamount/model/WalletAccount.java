package com.capg.ewallet.addamount.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WalletAccount {

	@Id
	private int accountId;
	private double accountBalance;
	private enum Status{ };
	private List<WalletTransactions> transactionHistory;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public List<WalletTransactions> getTransactionHistory() {
		return transactionHistory;
	}
	public void setTransactionHistory(List<WalletTransactions> transactionHistory) {
		this.transactionHistory = transactionHistory;
	}
	
	public WalletAccount() {
		// TODO Auto-generated constructor stub
	}
	public WalletAccount(int accountId, double accountBalance, List<WalletTransactions> transactionHistory) {
		super();
		this.accountId = accountId;
		this.accountBalance = accountBalance;
		this.transactionHistory = transactionHistory;
	}
	
	

}
