package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicGoogleSearch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\jee-oxygen\\eclipse-workspace\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.id("lst-ib")).sendKeys("Testing");
		// Descendant USe
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		System.out.println("Total Number of Suggestions: "+list.size());
		
		for (int i=0; i<=list.size(); i++) {
			
			System.out.println(list.get(i).getText());
			
			if (list.get(i).getText().contains("testing")) {
				
				list.get(i).click();
			}
			
			else {
				System.out.println("Conditional text is not present");
			}
		}
		
	}

}
