package com.capgemini.bankapp.service;

import java.util.List;

import com.capgemini.bankapp.entities.BankAccount;

public interface BankAccountService {
	public double getBalance(long accountId);
	public double withdraw(long accountId, double amount)throws LowBalanceException;
	public double deposit(long accountId, double amount);
	public boolean fundTransfer(long fromAccount, long toAccount, double balance)throws LowBalanceException;
	
}
