package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\jee-oxygen\\eclipse-workspace\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.freecrm.com");
		
		driver.findElement(By.name("username")).sendKeys("kuldeep");
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type, 'submit')]")).click();
		driver.switchTo().frame("mainpanel");
		
		// Get the links of all the links and Images
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img"))); // Add in the existing list
		
		List<WebElement> activelinks = new ArrayList<WebElement>();

		// Iterate linked list : exclude all the links and images those do not have href property.
		for (int i = 0; i<linklist.size(); i++) {
			System.out.println(linklist.get(i).getAttribute("href"));
			if (linklist.get(i).getAttribute("href") != null && (! (linklist.get(i).getAttribute("href").contains("javascript")))) {
				activelinks.add(linklist.get(i));
			}
		}
		
		// get the size of active links
		System.out.println(activelinks.size());
		
		// Check the href URL, with httpconnection API
		for (int j = 0; j<activelinks.size(); j++) {
			
			HttpURLConnection connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String responseMessage = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href"));
			System.out.println(responseMessage);
			
		}
	}
}