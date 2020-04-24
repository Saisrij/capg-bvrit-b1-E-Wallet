package com.capg.ewallet.createaccount.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class WalletAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountId;
	private double accountBalance;
	private enum Status{ };
	
	@OneToOne
	private WalletUser walletUser;
	
	@OneToMany(targetEntity = WalletTransactions.class, fetch = FetchType.EAGER)
	private List<WalletTransactions> transactionHistory;
	
	
	
	public WalletUser getWalletUser() {
		return walletUser;
	}
	public void setWalletUser(WalletUser walletUser) {
		this.walletUser = walletUser;
	}
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
