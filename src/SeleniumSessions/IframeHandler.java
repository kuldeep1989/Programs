package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandler {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workplace\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.freecrm.com");
		
		driver.findElement(By.name("username")).sendKeys("kuldeep"); // Enter Username
		driver.findElement(By.name("password")).sendKeys("123456");  // Enter Password
		WebElement btn = driver.findElement(By.xpath("//input[@type='submit']")); // Find Login Button
		if (btn.isEnabled()) {
			btn.click();
		}
	
		Thread.sleep(3000); // Wait Script for 3 Seconds
		driver.switchTo().frame(1); // Switch to Second Frame
		Thread.sleep(2000); // Wait Script for 2 Seconds
		
		driver.findElement(By.xpath("//div[@id='navmenu']/ul/li/a[@title=\"Contacts\"]")).click(); // Click Contacts
		
	}

}