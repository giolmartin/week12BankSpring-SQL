package com.meritamerica.week11.models;



import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.*;
@Entity
@Table
public class CDOffering {

	@Min(value = 1)
	private int term;
	
	@DecimalMin(value = "0.0", inclusive = false, message = "Interest must be greater than 0")
	@DecimalMax(value = "1.0", inclusive = false, message = "Interest rate must be lower than 1")
	private double interestRate;
	
	public  CDOffering() {
		
	}
	
	public CDOffering(int term, double interestRate) {
		this.term = term;
		this.interestRate = interestRate;
	}
	
	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
