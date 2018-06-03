package SeleniumSessions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitPageLoadWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workplace\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.half.ebay.com");
		
		Thread.sleep(2000);
		// Static Wait
		// It will wait till 2 second
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		// Wait Max 40 Second but if page load before then remaining time will be ignored.
		// Dynamic Wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Wait for 30 Second to Load all the Elements which does not load even after pageload.
		// Dynamic Wait, if Elements are loaded before 30 Second then rest time will be ignored.
		
		

	}

}
