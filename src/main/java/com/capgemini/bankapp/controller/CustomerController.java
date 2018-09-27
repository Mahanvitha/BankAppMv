package com.capgemini.bankapp.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.capgemini.bankapp.entities.Customer;
import com.capgemini.bankapp.service.CustomerService;

	@EnableAutoConfiguration
	@Controller
	public class CustomerController {

		@Autowired
		CustomerService customerService;

		@RequestMapping(value = "/", method = RequestMethod.GET)
		public String getHomePage() {
			return "home";
		}

		@RequestMapping(value = "/header", method = RequestMethod.GET)
		public String getHome() {
			return "home";
		}

		@RequestMapping(value = "/login", method = RequestMethod.GET)
		public String getLoginPage(Model model) {
			model.addAttribute("customer", new Customer());
			return "login";

		}

		@RequestMapping(value = "/login.do", method = RequestMethod.POST)
		public String login(@ModelAttribute Customer customer, HttpServletRequest request) {
			customer = customerService.authenticate(customer);
			if (customer != null) {
				HttpSession session = request.getSession();
				session.setAttribute("customer", customer);
				return "home";
			}
			return null;

		}
		@RequestMapping(value = "/logout", method = RequestMethod.GET)
		public String getLogoutPage(Model model) {
			return "logout";
		}
		
		@RequestMapping(value = "/editProfile", method = RequestMethod.GET)
		public String getEditPage(Model model, HttpServletRequest request,HttpSession session ) {
			 request.getSession();
			Customer customer = (Customer) session.getAttribute("customer");
			System.out.println(customer);
			model.addAttribute("customer", customer);
			return "editprofile";
		}
		
		@RequestMapping(value = "/editprofile.do", method = RequestMethod.POST)
		public String updateProfile(@ModelAttribute Customer customer, HttpServletRequest request) {
			customer = customerService.updateProfile(customer);
			if(customerService.updateProfile(customer)!=null) 
				return "successPage";
			return "errorPage";
				
	}
		
	}



