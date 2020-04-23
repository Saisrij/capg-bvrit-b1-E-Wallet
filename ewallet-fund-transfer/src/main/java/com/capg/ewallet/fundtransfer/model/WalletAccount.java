package com.capg.ewallet.fundtransfer.model;

import java.util.List;

public class WalletAccount {

	private int accountId;
	private double accountBalance;
	private enum status{ };
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
