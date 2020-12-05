package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssumptionsEx {
	
	
	@Test
    @DisplayName(value = "adding two positive numbers")
    void test_add_two_positive_numbers() {
        System.setProperty("ENV", "DEV");
        assumeTrue("DEV".equals(System.getProperty("ENV")));
        
        //If above assumption is true then rest of test will proceed
        int actualResult = Calculator.add(20, 10);
        assertEquals(30, actualResult);
    }
    
    @Test
    public void AssumtionsTest() {
        
        System.setProperty("ENV", "PROD");
        assumeFalse("DEV".equals(System.getProperty("ENV")), "FAilure Test");
        Assertions.assertEquals(7, Calculator.add(4, 3));    
        
    }
    
    @Test
    @DisplayName(value = "adding one two numbers")
    void testInAllEnvironments() {
        System.setProperty("ENV", "CI");
        assumingThat("CI".equals(System.getenv("ENV")),
            () -> {
                // This assertion only perform on the CI server
                assertEquals(60, Calculator.add(40, 20));
                System.out.println("check lambda");
            });
        System.out.println("check lambda");
        // perform these assertions in all environments
        assertEquals(130, Calculator.add(60, 70));
    }
}
