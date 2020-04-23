package com.capg.ewallet.createaccount.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.ewallet.createaccount.model.WalletUser;

public interface CreateAccountRepo extends JpaRepository<WalletUser, Integer> {

}
