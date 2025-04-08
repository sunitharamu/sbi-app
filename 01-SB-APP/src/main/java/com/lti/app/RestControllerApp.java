package com.lti.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerApp {
     @GetMapping("/login")
	public String welcomeMsg() {
		return "WELCOME TO VEERATECH";
	}
}
