package com.capgemini.bankapp.repository;

import java.util.List;

import com.capgemini.bankapp.entities.BankAccount;

public interface BankAccountRepository {
	public  double getBalance(long accountId);
	public  boolean updateBalance(long accountId, double newBalance);
}