package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YoutubeVideoPlay {

	public static void main(String[] args) throws Exception {



		System.setProperty("webdriver.chrome.driver", "E:\\jee-oxygen\\eclipse-workspace\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.youtube.com/watch?v=D86RtevtfrA");
		
		// In sikuli we have to capture the image and then it interact with your application
		// Create the Object of Screen Class which is coming from Sikuli
		
		Screen s = new Screen();
		Pattern pauseimg = new Pattern("E:\\jee-oxygen\\eclipse-workspace\\sikuli_images\\pause_button.jpg");
		s.wait(pauseimg, 2000);
		s.click();
		s.click();
		
		
	}

}
