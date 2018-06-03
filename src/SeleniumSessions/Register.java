package SeleniumSessions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Register {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workplace\\jars\\chromedriver.exe");
		WebDriver aurav_rgt = new ChromeDriver();
		Actions action = new Actions(aurav_rgt);
		
		aurav_rgt.get("https://www.auravdigital.com");
		String title = aurav_rgt.getTitle();
		if (title.equals("AURAV")) {
			System.out.println("Page has been loaded Successfully");
		}
		else {
			aurav_rgt.close();
		}
		
		aurav_rgt.findElement(By.xpath("//a[text()=\"Register\"]")).click();
		aurav_rgt.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		
		aurav_rgt.findElement(By.id("FirstName")).sendKeys("Kuldeep");
		aurav_rgt.findElement(By.id("LastName")).sendKeys("Yadav");
		aurav_rgt.findElement(By.id("Address")).sendKeys("Street-402,Noida");
		aurav_rgt.findElement(By.id("City")).sendKeys("Noida");
		
		aurav_rgt.findElement(By.id("ZipCode")).sendKeys("201301");
		aurav_rgt.findElement(By.id("EmailId")).sendKeys("kuldeep@omniesolutions.com");
		aurav_rgt.findElement(By.id("CompanyName")).sendKeys("Test_Company");
		
		aurav_rgt.findElement(By.id("UserName")).sendKeys("ksyhere123");
		aurav_rgt.findElement(By.id("Password")).sendKeys("123456789");
		aurav_rgt.findElement(By.id("ConfirmPassword")).sendKeys("123456789");
		
		aurav_rgt.switchTo().frame(0);
		
		WebElement captcha = aurav_rgt.findElement(By.className("recaptcha-checkbox-checkmark"));
		action.doubleClick(captcha).build().perform();;
		aurav_rgt.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		aurav_rgt.findElement(By.xpath("//input[@type='submit' and @value='Register']")).click();
		
	}
}
