package com.test;

import org.testng.annotations.Test;

public class TestNGDepends {

	@Test
	public void loginTest() {
		System.out.println("Login Test");
	}
	
	// This is the keyword, it will execute homepageTest when loginTest is passed or test case will be skipped.
	@Test (dependsOnMethods="loginTest")  
	public void homepageTest() {
		System.out.println("Homepage Test");
	}
	
	@Test
	public void searchpageTest() {
		System.out.println("SearchPage Test");
	}
	
}
