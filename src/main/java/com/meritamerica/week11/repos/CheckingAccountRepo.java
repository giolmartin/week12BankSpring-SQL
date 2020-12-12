package com.meritamerica.week11.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meritamerica.week11.models.CheckingAccount;

public interface CheckingAccountRepo extends JpaRepository<CheckingAccount, Integer>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
