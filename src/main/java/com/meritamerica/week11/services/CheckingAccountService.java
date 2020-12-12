package com.meritamerica.week11.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meritamerica.week11.models.CheckingAccount;
import com.meritamerica.week11.repos.CheckingAccountRepo;
@Service
public class CheckingAccountService {
	//private EntityManager entityManager;
	//public CheckingAccount insert(CheckingAccount checkingAccount) {
	//	entityManager.persist(checkingAccount);
	//	return checkingAccount;
//	}
	@Autowired
	CheckingAccountRepo repo;
	
	public CheckingAccount addCheckingAccount(CheckingAccount acc) {
		repo.save(acc);
		return acc;
	}
}
