package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableOption02 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\jee-oxygen\\eclipse-workspace\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.freecrm.com");
		
		driver.findElement(By.name("username")).sendKeys("kuldeep");
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type, 'submit')]")).click();
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		// Using Customized xpath...
		driver.findElement(By.xpath("//a[contains(text(),'test2 test2')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		

	}

}
