package com.meritamerica.week11.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meritamerica.week11.models.AccountHolder;
import com.meritamerica.week11.repos.AccountHolderRepo;
@Service
public class AccountHolderService {
	@Autowired
	AccountHolderRepo repo;
	
	public AccountHolder addAccountHolder(AccountHolder acc) {
		repo.save(acc);
		return acc;
	}
}
