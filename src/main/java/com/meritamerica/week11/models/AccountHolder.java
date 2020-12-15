package com.meritamerica.week11.models;



import java.util.ArrayList;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table
public class AccountHolder {

	private static final long  MAX_COMBINED_AMOUNT= 250000;
	private static int nextId = 1;
	private int id;



	@NotBlank(message = "Name may not be empty")
	//@Size(min = 2, max = 32, message = "Name must be between 2-32 characters long") 
	private String firstName;

	private String middleName;

	@NotBlank(message = "Need last name")
	private String lastName;

	@NotBlank(message = "Need to specify ssn")
	//@Size(min = 11, max = 11, message = "Not a valid SSN") 
	private String ssn;

	private List<CheckingAccount> checkingAccounts = new ArrayList<CheckingAccount>();
	private List<SavingsAccount> savingsAccounts = new ArrayList<SavingsAccount>();
	private List<CDAccount> cdAccounts = new ArrayList<CDAccount>();
	
	private  int numberOfCheckingAccounts ;
	private double checkingBalance;
	private  int numberOfSavingsAccounts;
	private double savingsBalance;
	private  int numberOfCDAccounts ;
	private double cdBalance;
	
	@Min(value = 0L) 
	@Max(value = 250000, message = "Over 250k")
	double combinedBalance;

	public AccountHolder() {
		this.id = nextId++;
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.ssn = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public CheckingAccount addCheckingAccount(double balance) {
	
		CheckingAccount checkingAccount = new CheckingAccount(balance);
		return checkingAccount;
	}

	public void addCheckingAccount(CheckingAccount checkingAccount) {
		checkingAccounts.add(checkingAccount);
		
	}

	public List<CheckingAccount> getCheckingAccounts() {
		return checkingAccounts;
	}

	public SavingsAccount addSavingsAccount(double balance) {
		SavingsAccount savingsAccount = new SavingsAccount(balance);
		return savingsAccount;
	}

	public void addSavingsAccount(SavingsAccount savingsAccount) {
		savingsAccounts.add(savingsAccount);
		
	}
	public List<SavingsAccount> getSavingsAccounts() {
		return savingsAccounts;
	}
	
	public void addCDAccounts(CDAccount cdAccount) {
		cdAccounts.add(cdAccount);
	}
	
	
	public List<CDAccount> getCdAccounts() {
		return cdAccounts;
	}
	
	
	

	public  double getCheckingBalance() {
		checkingBalance = 0;
		for(CheckingAccount cB : checkingAccounts) {
			checkingBalance += cB.getBalance();
		}
		return checkingBalance;
	}
	
	public double getSavingsBalance() {
		savingsBalance =0;
		for(SavingsAccount sB: savingsAccounts) {
			savingsBalance += sB.getBalance();
		}
		return savingsBalance;
	}
	public double getCDBalance() {
		cdBalance = 0;
		for(CDAccount cdA: cdAccounts) {
			cdBalance += cdA.getBalance();
		}
		return cdBalance;
	}
	
	public int getNumberOfCheckingAccounts() {
		return checkingAccounts.size();
	}

	public int getNumberOfSavingsAccounts() {
		return savingsAccounts.size();
	}

	public int getNumberOfCDAccounts() {
		return  cdAccounts.size();
	}

	public double getCombinedBalance() 
	{
		this.combinedBalance	= getCheckingBalance()+ getSavingsBalance() + getCDBalance();
		return combinedBalance;
	}


}
