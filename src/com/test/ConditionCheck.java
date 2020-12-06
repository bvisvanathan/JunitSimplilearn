package com.test;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class ConditionCheck implements ExecutionCondition {
	
    @Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		// TODO Auto-generated method stub
		
		String env = "dev";
		
		
        if ("qa".equalsIgnoreCase(env)) {
            return ConditionEvaluationResult
              .disabled("Test disabled on QA environment");
        }
        
        return ConditionEvaluationResult.enabled(
          "Test enabled on Dev environment");
    }


}
