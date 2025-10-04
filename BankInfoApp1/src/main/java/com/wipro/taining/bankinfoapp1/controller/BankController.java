package com.wipro.taining.bankinfoapp1.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.wipro.taining.bankinfoapp1.model.Branch;
import com.wipro.taining.bankinfoapp1.model.Service;

@Controller
public class BankController {

	@GetMapping("/branches")
	public String showBranches(Model model) {
		model.addAttribute("bankName","Union Bank of India");
		List<Branch> branches=List.of(
		new Branch("Whitefield","Whitefield,Bangalore"),
		new Branch("Jaynagar","Jaynagar,Bangalore"),
		new Branch("Koramangala","Koramangala,Bangalore"),
		new Branch("HSR Layout","HSR Layout,Bangalore"),
		new Branch("Malleshwaram","Malleshwaram,Bangalore"),
		new Branch("BTM Layout","BTM Layout,Bangalore"),
		new Branch("Banashankari","Banashankari,Bangalore"),
		new Branch("Rajaji nagar","Rajaji nagar,Bangalore"),
		new Branch("MR Road","MR Road,Bangalore"),
		new Branch("Indira nagar","Indira nagar,Bangalore")
						
				);
		model.addAttribute("branches",branches);
		return "branches";
	}
	
	@GetMapping("/services")
	public String showServices(Model model) {
		model.addAttribute("bankName","Union Bank of India");
		List<Service> services=List.of(
		new Service("Credit","Cash Deposit"),
		new Service("Debit","Cash Withdrawal"),
		new Service("Insurance","Health & Life insurance"),
		new Service("Loan","Home Loan & Educational Loan"),
		new Service("FD","Fixed Deposit"),
		new Service("Net Banking","Online based banking"),
		new Service("Mobile Banking","App based banking"),
		new Service("Mutual funds","Investment options"),
		new Service("Personal loans","Quick and affordable loans"),
		new Service("Credit Card","Visa and Mastercard options")
				);
		model.addAttribute("services",services);
		return "services";
	}
	
}
