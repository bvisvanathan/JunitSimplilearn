package com.test;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverProvider implements ParameterResolver {
	
	
	    @Override
	    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
	            throws ParameterResolutionException {
	        // TODO Auto-generated method stub
	        return parameterContext.getParameter().getType() == ChromeDriver.class;
	    }
	    @Override
	    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
	            throws ParameterResolutionException {
	        // TODO Auto-generated method stub
	        return new ChromeDriver();
	    }
	    
	    
	

}
