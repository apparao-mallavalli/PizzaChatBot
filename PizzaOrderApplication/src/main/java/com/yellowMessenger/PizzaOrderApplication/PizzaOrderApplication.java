package com.yellowMessenger.PizzaOrderApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PizzaOrderApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(PizzaOrderApplication.class, args);
	}

}
