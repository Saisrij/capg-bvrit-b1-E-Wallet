package com.capg.ewallet.accountms.service;

import java.util.List;

import com.capg.ewallet.accountms.model.WalletUser;

public interface ICreateAccountService {
	
	public WalletUser createUserAccount(WalletUser user);
	public List<WalletUser> getAllUsers();

}
