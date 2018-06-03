package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropBoxes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\jee-oxygen\\eclipse-workspace\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.id("dropdownMenuButton")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class ='dropdown-menu'and @aria-labeledby='dropdownMenuButton']//a"));
		System.out.println(list.size());
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
		}	
	}
}