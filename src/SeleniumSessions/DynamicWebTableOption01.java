package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableOption01 {

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
		
		String before_xpath = "//*[@id='vContacts/Form']/table/tbody/tr[";
		String after_xpath = "]/td[2]/a";
		
		// Using for loop in xpath...
		for (int i=4; i<=7; i++) 
		{	
			String name = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			System.out.println(name);
			if (name.contains("est2 test2")) 
			{
				driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
				
			}
			
		}
		
	}

}
