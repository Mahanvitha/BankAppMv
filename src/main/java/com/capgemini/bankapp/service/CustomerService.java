package com.capgemini.bankapp.service;

import com.capgemini.bankapp.entities.Customer;
import com.capgemini.bankapp.service.impl.UpdateFailedException;

public interface CustomerService {
	public Customer authenticate(Customer customer);
	public Customer updateProfile(Customer customer) throws UpdateFailedException;
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) ;

}

