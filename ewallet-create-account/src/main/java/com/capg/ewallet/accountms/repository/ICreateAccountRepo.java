package com.capg.ewallet.accountms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.ewallet.accountms.model.WalletUser;

public interface ICreateAccountRepo extends JpaRepository<WalletUser, Integer> {

}
