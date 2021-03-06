package com.capg.ewallet.accountms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class WalletUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	private String password;
	private long phoneNumber;
	private String loginName;
	
//	@OneToOne
//	private WalletAccount walletAccount;
//	
//	public WalletAccount getWalletAccount() {
//		return walletAccount;
//	}
//	public void setWalletAccount(WalletAccount walletAccount) {
//		this.walletAccount = walletAccount;
//	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	public WalletUser() {
		// TODO Auto-generated constructor stub
	}
	public WalletUser(int userId, String userName, String password, long phoneNumber, String loginName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.loginName = loginName;
	}
	@Override
	public String toString() {
		return "WalletUser [userId=" + userId + ", userName=" + userName + ", phoneNumber=" + phoneNumber
				+ ", loginName=" + loginName + "]";
	}
	
	

}
