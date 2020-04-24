package com.capg.ewallet.addamount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.ewallet.addamount.model.WalletAccount;
import com.capg.ewallet.addamount.service.AddAmountServiceImpl;

@RestController
@RequestMapping("/add")
public class AddAmountController {
	
	@Autowired
	AddAmountServiceImpl service;
	
	@GetMapping("/account/id/{id}")
	public WalletAccount addAmount(@PathVariable int id, @RequestBody double amount) {
		WalletAccount acc=service.getAccountById(id);
		return service.addAmount(amount, acc);
		
	}

}
