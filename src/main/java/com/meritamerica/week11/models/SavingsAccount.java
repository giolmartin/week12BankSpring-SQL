package com.meritamerica.week11.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class SavingsAccount extends BankAccount {

	
	private static final double INTEREST_RATE = 0.001 ;
	
	public SavingsAccount() {
		super(INTEREST_RATE);
	}
	
	public SavingsAccount(double balance) {
		super(balance,INTEREST_RATE);
		}

	
	
}
