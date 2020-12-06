package com.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.seljup.SeleniumJupiter;

//@ExtendWith(SeleniumJupiter.class)
@ExtendWith(DriverProvider.class)
public class AmazonLoginTest {
	
	
	
	    
	    @Test
	    public void test(ChromeDriver driver) {
	        
	        driver.get("https://www.amazon.com/");
	        
	        WebElement LoginElement = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
	        
	        LoginElement.click();
	        
	        WebElement EmailId = driver.findElement(By.xpath("//*[@id='ap_email']"));
	        
	        EmailId.sendKeys("abc@xyz.com");
	        
	        WebElement Continue = driver.findElement(By.xpath("//*[@id='continue']"));
	        Continue.click();
	        
	        WebElement Password = driver.findElement(By.xpath("//*[@id='ap_password']"));
	        
	        Password.sendKeys("12345");
	        
	        WebElement Loginbtn = driver.findElement(By.xpath("//*[@id='signInSubmit']"));
	        
	        Loginbtn.click();
	            
	        
	    }
	

}
