package com.sangati.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	
	public String helloWorld()
	{
		return "Hello Spring Boot, Login Page";
	}

}
