package com.capgemini.bankapp.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.bankapp.entities.Customer;
import com.capgemini.bankapp.service.BankAccountService;
import com.capgemini.bankapp.service.LowBalanceException;


@Controller
public class BankAccountController {
	@Autowired
	BankAccountService bankAccountService;
	
	@RequestMapping(value = "/checkBalance.do", method = RequestMethod.GET)
	public String getBalanceEnquiry() {
		return "checkBalance";
	}
	
	@RequestMapping(value="/transferAmount",method=RequestMethod.GET)
	public String getFundTransferPage() {
		return "transfer";
	}
	
	@RequestMapping(value="/transfer",method=RequestMethod.POST)
public String fundTransfer(HttpSession session,HttpServletRequest request,Model model,@RequestParam long fromAccount,@RequestParam long toAccount,@RequestParam double amount) throws LowBalanceException {
		Customer customer=(Customer) session.getAttribute("customer");
		bankAccountService.fundTransfer(fromAccount, toAccount, amount);
		session.setAttribute("customer", customer);
		request.setAttribute("success", true);
		return "success";
	}
}
