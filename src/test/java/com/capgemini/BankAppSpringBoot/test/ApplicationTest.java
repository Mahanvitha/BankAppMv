package com.capgemini.BankAppSpringBoot.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.bankapp.controller.CustomerController;

public class ApplicationTest {

	@RunWith(SpringRunner.class)
	@SpringBootTest
	public class HdfcbankApplicationTests {

		@Test
		public void contextLoads() {
			CustomerController customerController = new CustomerController();
			String result = customerController.getChangePasswordPage();
			assertEquals(result, "changePassword");

		}

	}

}
