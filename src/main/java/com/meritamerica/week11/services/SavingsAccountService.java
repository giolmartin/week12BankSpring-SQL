package com.meritamerica.week11.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meritamerica.week11.models.SavingsAccount;
import com.meritamerica.week11.repos.SavingsAccountRepo;

@Service
public class SavingsAccountService {
	
	@Autowired
	SavingsAccountRepo repo;
	
	public SavingsAccount addSavingsAccount(SavingsAccount acc) {
		repo.save(acc);
		return acc;
	}
	
}
