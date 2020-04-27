package com.capg.ewallet.accountms.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class WalletAccount {

	@Id
	private int accountId;
	private double accountBalance;
	//private enum Status{ };
	@ElementCollection
	@OneToMany(targetEntity = WalletTransactions.class)
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
		//this.transactionHistory = transactionHistory;
	}
	
	

}
