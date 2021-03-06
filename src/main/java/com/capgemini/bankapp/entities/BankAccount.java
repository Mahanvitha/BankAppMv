package com.capgemini.bankapp.entities;

public class BankAccount {
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountType=" + accountType + ", accountHolderName="
				+ accountHolderName + ", accountBalance=" + accountBalance + "]";
	}

	public BankAccount() {
		super();
	}
	
	private long accountId;
	private String accountType;
	private String accountHolderName;
	private double accountBalance;
	public BankAccount(long accountId, String accountType, String accountHolderName, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	
}
