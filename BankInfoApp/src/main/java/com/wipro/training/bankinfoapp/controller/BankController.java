package com.wipro.training.bankinfoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@GetMapping("/home")
	public String home() {
		return "App is running with H2 DB!";
	}

	@GetMapping("/bank-name")
	public String getBankName() {
		return "Union Bank";
	}
	
	@GetMapping("/bank-address")
	public String getBankAddress() {
		return "123,2nd Finance Street,Chennai,Tamil Nadu";
	}
	
	
	
}
