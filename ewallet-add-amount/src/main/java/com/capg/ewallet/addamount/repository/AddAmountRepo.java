package com.capg.ewallet.addamount.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.ewallet.addamount.model.WalletAccount;

public interface AddAmountRepo extends JpaRepository<WalletAccount, Integer> {

}
