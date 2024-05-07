package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forget {
	
	public static WebDriver driver;


	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement fpass;

	public WebElement getFpass() {
		return fpass;
	}

	
	public Forget(WebDriver driver2) {
this.driver= driver2;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
}
