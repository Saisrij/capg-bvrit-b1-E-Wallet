package com.capg.ewallet.createaccount.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.ewallet.createaccount.model.WalletUser;
import com.capg.ewallet.createaccount.repository.CreateAccountRepo;

@Service
public class CreateAccountServiceImpl implements CreateAccountService{
	
	@Autowired
	CreateAccountRepo repo;
	
	@Transactional
	public WalletUser createUserAccount(WalletUser user) {
		return repo.save(user);
	}

}
