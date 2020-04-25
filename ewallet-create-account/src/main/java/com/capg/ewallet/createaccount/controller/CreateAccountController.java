package com.capg.ewallet.createaccount.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.ewallet.createaccount.model.WalletUser;
import com.capg.ewallet.createaccount.service.CreateAccountServiceImpl;

@RestController
@RequestMapping("/create")
public class CreateAccountController {
	
	@Autowired
	CreateAccountServiceImpl service;
	
	@PostMapping("/user")
	public WalletUser createUserAccount(@RequestBody WalletUser user) {
		return service.createUserAccount(user);
	}
	
	@GetMapping("/get-all")
	public List<WalletUser> getAllUsers(){
		return service.getAllUsers();
	}

}
