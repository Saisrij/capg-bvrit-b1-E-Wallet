package com.capg.ewallet.createaccount.service;

import java.util.List;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.ewallet.createaccount.model.WalletAccount;

import com.capg.ewallet.createaccount.model.WalletUser;
import com.capg.ewallet.createaccount.repository.CreateAccountRepo;

@Service
public class CreateAccountServiceImpl implements CreateAccountService{
	
	@Autowired
	CreateAccountRepo repo;
	
	@Transactional
	public WalletUser createUserAccount(WalletUser newUser) {
		
		Random r=new Random();
		int newUserId=r.nextInt(1000);
		int newAccountId=r.nextInt(1000);
		
	    WalletAccount newAccount=new WalletAccount();
	    newAccount.setAccountId(newAccountId);
	    newAccount.setAccountBalance(0);
	    newAccount.setTransactionHistory(null);
	    
	    newUser.setUserId(newUserId);
	    newUser.setWalletAccount(newAccount);
	    
		return repo.save(newUser);
	}
	
	
	@Transactional
	public List<WalletUser> getAllUsers(){
		return repo.findAll();
	}

}
