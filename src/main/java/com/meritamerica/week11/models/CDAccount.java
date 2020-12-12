package com.meritamerica.week11.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
@Entity
public class CDAccount extends BankAccount{

	@Id
	@GeneratedValue
	public  int id;
	@Min(value = 1)
	private int term;
	
	

	public CDAccount() {
		super();
	}
	public CDAccount( double balance, double interestRate, int term) {
		super(balance, interestRate);
		this.term = term;
		
	}
	
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	
	
}
