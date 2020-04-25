package com.capg.ewallet.showbalance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.ewallet.showbalance.model.WalletTransactions;

public interface ShowTransactionsRepo extends JpaRepository<WalletTransactions, Integer> {

}
