package com.wipro.taining.bankinfoapp1.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

	@GetMapping("/health")
	public Map<String,String> getHealthStatus(){
		return Map.of("status","UP");
		}
	
	
}
