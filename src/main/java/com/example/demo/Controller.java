package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/")
	public String aaa() {
		return "home.jsp";
	}
	
	@RequestMapping("/login")
	public String loginpage() {
		return "login.jsp";
	}
	
	@RequestMapping("/logout")
	public String logoutpage() {
		return "logout.jsp";
	}
}
