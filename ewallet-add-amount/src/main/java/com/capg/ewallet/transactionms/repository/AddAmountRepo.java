package com.capg.ewallet.transactionms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.ewallet.transactionms.model.WalletAccount;

public interface AddAmountRepo extends JpaRepository<WalletAccount, Integer> {

}
