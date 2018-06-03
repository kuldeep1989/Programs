package SeleniumSessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		
		// System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workplace\\jars\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		// Mostly Used if the test cases are to run for smoke testing / sanity testing
		// Ghost Driver --- Headless Browser:
				// HtmlUnitDriver --- Java
				// Phantom JS --- JavaScript
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());	
	}
}