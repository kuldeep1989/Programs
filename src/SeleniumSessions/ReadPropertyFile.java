package SeleniumSessions;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropertyFile {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("D:\\Eclipse\\workplace\\AURAV\\src\\aurav\\base\\config.properties");
		prop.load(ip); // Use to load the file put on the given path in ""
	
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("Age"));
		
		String URL = prop.getProperty("URL");
		String BrowserName = prop.getProperty("browser");
		
		
		if (BrowserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\workplace\\jars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (BrowserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Eclipse\\workplace\\jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (BrowserName.equals("Internet Explorer")) {
			System.setProperty("webdriver.ie.driver", "D:\\Eclipse\\workplace\\jars\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.get(URL);
	}

}
