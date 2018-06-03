package SeleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workplace\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions mouse = new Actions(driver);
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		mouse.dragAndDrop(driver.findElement(By.id("draggable")), (driver.findElement(By.id("droppable")))).build().perform();;
		
		// mouse.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		
	}

}
