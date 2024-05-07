package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Page_object_Manager {

	public static WebDriver driver;

	private WebElement demoLogin;

	public Login getDemoLogin() {

		Login l = new Login(driver);

		return l;
	}

	private WebElement demoForgot;

	public com.base.Forget getDemoForgot() {
		Forget f = new Forget(driver);

		return f;
	}
	
	public Page_object_Manager(WebDriver driver) {
		
this.driver= driver;
		
		PageFactory.initElements(new fi, this);
	}

}
