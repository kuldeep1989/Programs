package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "E:\\jee-oxygen\\eclipse-workspace\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.freecrm.com/register/");
		
		// isDisplayed Method
		boolean status1 = driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(status1);
		
		// isEnabled Method
		boolean status2 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(status2);
		
		// isSelected Method ---- Works in Case of Checkboxes,RadioButton
		boolean status3 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(status3);
	}

}
