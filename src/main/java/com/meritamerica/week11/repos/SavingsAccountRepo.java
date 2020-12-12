package com.meritamerica.week11.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meritamerica.week11.models.SavingsAccount;

public interface SavingsAccountRepo extends JpaRepository<SavingsAccount, Integer> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
