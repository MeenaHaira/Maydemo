package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public static WebDriver driver;

	@FindBy(id ="email")
	private WebElement userName;
	
	public WebElement getUserName() {
		return userName;
	}


	@FindBy(id ="pass")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}

	
	public Login(WebDriver driver1) {
		this.driver= driver1;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	

}
