package com.capgemini.bankapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.capgemini.bankapp.entities.Customer;
import com.capgemini.bankapp.repository.CustomerRepository;
import com.capgemini.bankapp.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer authenticate(Customer customer) throws CustomerNotFoundException {
		try {
			return customerRepository.authenticate(customer);

		} 
		catch (DataAccessException e) {
			CustomerNotFoundException exception = new CustomerNotFoundException("Customer not found");
			exception.initCause(e);
			throw exception;
		}

	}

	@Override
	public Customer updateProfile(Customer customer) throws UpdateFailedException {
		try {
		return customerRepository.updateProfile(customer);
	}
		catch(DataAccessException e) {
			UpdateFailedException updateFailedException = new UpdateFailedException("Failed to update deatails");
			updateFailedException.initCause(e);
			throw updateFailedException;
		}
	}

	@Override
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) {

		return customerRepository.updatePassword(customer, oldPassword, newPassword);

	}
}
