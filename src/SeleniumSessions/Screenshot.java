package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot {

	public static void main(String[] args) throws IOException {

		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workplace\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		// Take Screenshot and Store as a File Format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		// Now Copy the Screenshot to desired location using copyfile method
		FileUtils.copyFile(src, new File("C:\\Users\\Ajgar\\Desktop\\Screenshot.jpeg"));
		
		
	}

}
