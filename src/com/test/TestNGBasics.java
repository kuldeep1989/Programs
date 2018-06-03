package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeSuite
	public void setup() {
		System.out.println("Install Chrome");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launch Chrome Browser");
	}
	
	@BeforeClass
	public void enterURL() {
		System.out.println("Enter the URL");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Login Method");
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout Method");
	}
	
	@AfterClass
	public void deleteCookies () {
		System.out.println("Delete the Cookies");
	}
	
	@AfterTest
	public void closeBrowser () {
		System.out.println("Close the Browser");
	}
	
	@AfterSuite
	public void generateReport() {
		System.out.println("Report Generated");
	}
}