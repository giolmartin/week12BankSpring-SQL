package com.meritamerica.week11.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@Entity
public class CheckingAccount extends BankAccount{
	
	@Id
	@GeneratedValue
	private static  int id;
	private static final double INTEREST_RATE = .0001;


	public CheckingAccount(double balance)   {
		super(balance, INTEREST_RATE);
	
	}
	
	 public CheckingAccount()  {
		 super(INTEREST_RATE);
		 }
	
	

	
}
