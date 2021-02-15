package com.sjaluser.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
class CalculatorController {
 @Autowired
 private Calculator calculator;
 	 @CrossOrigin
	 @RequestMapping("/sum")
	 public String sum(@RequestParam("a") Integer a,
	 @RequestParam("b") Integer b) {
		 return String.valueOf(calculator.sum(a, b));
 }
}