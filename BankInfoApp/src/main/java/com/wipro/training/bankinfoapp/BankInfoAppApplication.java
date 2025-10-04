package com.wipro.training.bankinfoapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BankInfoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankInfoAppApplication.class, args);
	}
		
	@Bean
	public CommandLineRunner listBeans(ApplicationContext context) {
		return args->{
		System.out.println("<<<<<<<<<<<<<<<<<<START OF SPRING BOOT DEFAULT BEANS>>>>>>>>>>>>>>>");
		String [] beanNames=context.getBeanDefinitionNames();
		for(String beanName:beanNames) {
			System.out.println(beanName);
					}
		System.out.println("<<<<<<<<<<<<<<END OF SPRING BOOT DEFAULT BEANS>>>>>>>>>>>>>>>>>>");
	};

}
	}
