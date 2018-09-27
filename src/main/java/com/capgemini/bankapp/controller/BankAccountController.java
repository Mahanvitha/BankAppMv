package com.capgemini.bankapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.capgemini.bankapp.service.BankAccountService;

@Controller
public class BankAccountController {
	@Autowired
	BankAccountService bankAccountService;
}
