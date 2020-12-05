package com.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class Dynamictest {	
	@TestFactory
    public Collection<DynamicTest> dynamicTestsWithCollection() {
        return Arrays.asList(
          DynamicTest.dynamicTest("Add test",
            () -> Assertions.assertEquals(2, Calculator.add(1, 1))),
          DynamicTest.dynamicTest("Multiply Test",
            () -> Assertions.assertEquals(4, Math.multiplyExact(2, 2))));
    }


}
