package com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedTests {
	
	
	@RepeatedTest(3)
    @DisplayName(value ="Calculator Test")
    void testCalcTwo() 
    {
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals( 6 , Calculator.add(2, 4));
    }
     
     @RepeatedTest(value= 3, name= "{displayName} {currentRepetition}/{totalRepetitions}")    
     @DisplayName("Multiplication")
     void multiply () 
      {
             int a, b;
              a=10;
              b=20;
              Assertions.assertEquals(200, (a*b), "Matched. Test status - Passed");
     }
     
    @RepeatedTest(3)
    @DisplayName(value ="Calculator Test")
    void testCalcThree(RepetitionInfo repinfo) 
    {
        System.out.println("CurrentTest: " + repinfo.getCurrentRepetition());
        Assertions.assertEquals( 6 , Calculator.add(2, 4));
    }

}
