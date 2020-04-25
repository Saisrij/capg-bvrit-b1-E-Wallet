package com.capg.ewallet.fundtransfer.service;

import com.capg.ewallet.fundtransfer.model.WalletAccount;

public interface FundTransferService {
	public WalletAccount fundtransfer(double amount,WalletAccount fromaccount,WalletAccount toaccount);

}
