package com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledTest {
	
	
	@Disabled
	@Test
	void testCalcOne() {
		
		System.out.println("test1 executed");
		Assertions.assertEquals(2, Calculator.add(2, 3));
		
	}
	
	@Test
	void testCalcTwo() {
		System.out.println("test2 executed");
		Assertions.assertEquals(5, Calculator.add(2, 3));
		
	}

}
