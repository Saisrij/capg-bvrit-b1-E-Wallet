package com.capg.ewallet.createaccount.service;

import java.util.List;

import com.capg.ewallet.createaccount.model.WalletUser;

public interface CreateAccountService {
	
	public WalletUser createUserAccount(WalletUser user);
	public List<WalletUser> getAllUsers();

}
