package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPriorityGroups {
		
		WebDriver driver;
		
		@BeforeMethod
		public void setUp() {
			System.setProperty("webdriver.chrome.driver", "E:\\jee-oxygen\\eclipse-workspace\\jars\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.google.com");
		}	
		
		@Test (priority=1, groups="Title")
		public void googleTitleTest() {
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		@Test (priority=2, groups="Logo")
		public void googleLogoTest() {
			boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
			System.out.println(b);
		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
	
}