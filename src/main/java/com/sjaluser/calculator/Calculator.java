package com.sjaluser.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculator {

	public static void main(String[] args) {
		SpringApplication.run(Calculator.class, args);
	}

	int sum(int a, int b) {
		 return (a + b)*2;
		 }
}
