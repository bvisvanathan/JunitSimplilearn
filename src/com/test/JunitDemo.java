package com.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ConditionCheck.class)
public class JunitDemo {
	
	
	@BeforeAll
	static void setup() {
		System.out.println("executed before all");
	}
	
	@BeforeEach
	public void setupThis() {
		System.out.println("executed before each");
	}
	
	
	@Disabled
	@Test
	public void test1() {
		
		System.out.println("executed test1");
		Assertions.assertTrue(true);
	}
	
	@Highpriority
	public void test2() {
		
		System.out.println("executed test2");
		Assertions.assertTrue(true);
	}
	
	@AfterEach
	public void tearThis() {
		System.out.println("executed after each");
	}
	
	@AfterAll
	static void tear() {
		System.out.println("executed after all");
	}

}
