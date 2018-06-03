package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workplace\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #1")).click();
		Thread.sleep(2000);
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String parentwindowid = it.next(); // Give you id of parent window
		String childwindowid = it.next(); // Give you id of child window
		
		driver.switchTo().window(childwindowid);
		driver.getTitle();
		driver.close();
		
		driver.switchTo().window(parentwindowid);
		driver.getTitle();
		
	}
}