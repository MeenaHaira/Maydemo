package com.Facebook;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.base.Base_Class;

public class A implements IRetryAnalyzer{

	int start =1; 
	int end = 3;
	
	public boolean retry(ITestResult result) {
		if(start<=end) {
			start++;
			return true; 
		}
		return false;
	}
	
 
	
	
	
}
