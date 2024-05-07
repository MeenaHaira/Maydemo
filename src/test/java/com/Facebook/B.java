package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.Base_Class;
import com.base.Login;
import com.base.Page_object_Manager;


public class B extends Base_Class{
public static WebDriver driver;
    
	public static void main(String[] args) {
		
	
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\Apple\\eclipse-workspace\\Facebook\\driver\\chromedriver.exe");
//
//		 driver = new ChromeDriver();
		
		
		getDriver("chrome");
		getUrl("https://www.facebook.com/");
		// driver.get();
	Page_object_Manager p = new Page_object_Manager(driver);
		 
inputValue(p.getDemoLogin().getUserName(), "meena@123");				
		inputValue(p.getDemoLogin().getPassword(),"2288");
		
		
		
		clickOnElement(p.getDemoForgot().getFpass());
		
	}
	
	
}
