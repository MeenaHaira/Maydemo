package com.base;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Base_Class {
	public static WebDriver driver;

	public static void getDriver(String value) {
		
		if (value.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Apple\\eclipse-workspace\\Facebook\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (value.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Apple\\eclipse-workspace\\Facebook\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}

	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void getSS() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File s = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\Apple\\eclipse-workspace\\Gt_Selenium\\Screenshot\\img1.png");
		// FileUtils.copyFile(s, d);
		FileHandler.copy(s, d);
	}

	public static void getMax() {
		driver.manage().window().maximize();
	}

	public static void inputValue(WebElement a, String b) {
		a.sendKeys(b);

	}

	public static void clickOnElement(WebElement s) {
		s.click();

	}

}
