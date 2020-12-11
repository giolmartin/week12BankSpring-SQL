package com.meritamerica.week11.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CheckingAccount extends BankAccount{
	
	
	private static final double INTEREST_RATE = .0001;


	public CheckingAccount(double balance)   {
		super(balance, INTEREST_RATE);
	
	}
	
	 public CheckingAccount()  {
		 super(INTEREST_RATE);
		 }
	
	

	
}
