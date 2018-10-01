package com.capgemini.bankapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class ExceptionController {
	@ExceptionHandler(value=Exception.class)
	public String errorPage(HttpServletRequest request, Exception exception) {
		System.out.println(exception);
		request.setAttribute("success",false);
		request.setAttribute("error", exception.getMessage());
		return "success";
	}
}

