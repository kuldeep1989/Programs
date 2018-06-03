package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\jee-oxygen\\eclipse-workspace\\jars\\chromedriver.exe");
		
		// launch the headless browser for Chrome Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		// Mandatory Options:
		// 1. Window Size should be (1400 * 800)
		// 2. Chrome Version should be greater than 59 on mac and greater than 60 on windows
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.freecrm.com");
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
