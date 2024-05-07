package com.Facebook;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestNGDemo{

	@Test(retryAnalyzer = A.class)
private void practice() {

	String actual = "AAA";
	String expected = "BBB"; 
	
	System.out.println("Login succssfully");
	
	//SoftAssert s = new SoftAssert();

	assertEquals(actual, expected);
	
}
	

	 
	
	 
	 

}
