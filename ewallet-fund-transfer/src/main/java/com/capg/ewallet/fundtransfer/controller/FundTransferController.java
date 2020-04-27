package com.capg.ewallet.fundtransfer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.ewallet.fundtransfer.model.WalletAccount;
import com.capg.ewallet.fundtransfer.service.FundTransferServiceImpl;


@RestController
@RequestMapping("/transfer")
public class FundTransferController {
	@Autowired
	FundTransferServiceImpl service;
	@GetMapping("/account/id/{id}/id/{id}")
	public WalletAccount fundtransfer(@PathVariable ("id") String fromaccountid,@PathVariable ("id") String toaccountid, @RequestBody double amount) {
		WalletAccount account1=service.getByAccountId();
		WalletAccount account2=service.getByAccountId();
		return service.fundtransfer(amount, account1,account2);
	}
	


}
