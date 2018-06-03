package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workplace\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.freecrm.com");
		
		driver.findElement(By.name("username")).sendKeys("kuldeep");
		driver.findElement(By.name("password")).sendKeys("123456");
		// driver.findElement(By.xpath("//input[contains(@type='submit')]")).click();


		WebElement loginbtn = driver.findElement(By.xpath("	//input[contains(@type, 'submit')]")); // login button
		flash(loginbtn, driver); // Calling flash method to flash the button

	}
		
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor je = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}	
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("arguments[0].style.backgroundColor ='"+color+"'", element);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}

	public static void drawBorder (WebElement element, WebDriver driver) {
		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static void generateAlert (WebDriver driver, String message) {
		JavascriptExecutor je = ((JavascriptExecutor) driver);
		je.executeScript("alert('"+message+"')");
	}
}