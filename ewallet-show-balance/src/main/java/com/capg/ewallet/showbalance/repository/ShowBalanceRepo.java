package com.capg.ewallet.showbalance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.ewallet.showbalance.model.WalletAccount;

public interface ShowBalanceRepo extends JpaRepository<WalletAccount, Integer> {

}
