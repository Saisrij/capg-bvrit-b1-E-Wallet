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
	@GetMapping("/account/id/{fromId}/id/{toId}")
	public WalletAccount fundtransfer(@PathVariable ("fromId") int fromAccountId,@PathVariable ("toId") int toAccountId, @RequestBody double amount) {
		WalletAccount fromAccount=service.getAccountById(fromAccountId);
		WalletAccount toAccount=service.getAccountById(toAccountId);
		return service.fundtransfer(amount, fromAccount,toAccount);
	}
	


}
