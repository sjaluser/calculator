package com.sjaluser.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;


@SpringBootTest
class CalculatorTests {

	private Calculator calculator = new Calculator();

	@Test
	void contextLoads() {
	}
	
	@Test
	 public void testSum() {
		assertEquals(10, calculator.sum(2, 3));
	 }
	
	@Test
	 public void testSum2() {
		assertEquals(8, calculator.sum(2, 2));
	 }

}
