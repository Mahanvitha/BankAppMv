package com.capgemini.BankAppSpringBoot.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.bankapp.controller.CustomerController;
import com.capgemini.bankapp.entities.BankAccount;
import com.capgemini.bankapp.entities.Customer;
import com.capgemini.bankapp.repository.CustomerRepository;

public class TestApplication {

	public class TestClass {

		@InjectMocks
		CustomerController customerController;

		@Mock
		CustomerRepository customerRepository;

		@Before
		public void init() {
			MockitoAnnotations.initMocks(this);
		}

		@Test
		public void testAuthenticate() {
			Customer customer = new Customer();
			customer.setCustomerId(12344);
			customer.setCustomerPassword("s1");

			Customer customer1 = new Customer(2, "sam", "s1", "sam@gmail.com", "ab", LocalDate.of(1945, 07, 15),
					new BankAccount(12344, "CURRENT", "sam", 42000));

			when(customerRepository.authenticate(customer)).thenReturn(customer1);

			assertEquals(customer1, customerRepository.authenticate(customer));

		}
	}
}
