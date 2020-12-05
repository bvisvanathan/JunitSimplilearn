package com.test;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public interface TestInterfaceDynamicTestDemo {
	
	  @TestFactory
	    default Stream<DynamicTest> dynamicTestsForPalindromes() {
	        return Stream.of("racecar", "radar", "mom", "dad")
	            .map(text -> DynamicTest.dynamicTest(text, () -> Assertions.assertTrue(StringFunctions.isPalindrome(text))));
	    }
	

}
