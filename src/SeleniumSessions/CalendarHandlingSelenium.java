package SeleniumSessions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarHandlingSelenium {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\jee-oxygen\\eclipse-workspace\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.freecrm.com");
		
		driver.findElement(By.name("username")).sendKeys("kuldeep");
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type, 'submit')]")).click();
		driver.switchTo().frame("mainpanel");
		
		String date = "18-September-2017";		// save date in a string
		String datearray[] = date.split("-");	// Split date string by -
		String day = datearray[0];
		String month = datearray[1];
		String year = datearray[2];
		
		Select select = new Select(driver.findElement(By.name("slcMonth")));
		select.selectByVisibleText(month);
		
		Select select1 = new Select(driver.findElement(By.name("slcYear")));
		select1.selectByVisibleText(year);
		
		String before_xpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String after_xpath = "]/td[";
		
		final int totalweekdays = 7;
		
		boolean flag = false;
		String CalendarDay;
		for(int rownum = 2; rownum<=7; rownum++) {
			
			for (int colnum = 1; colnum<=totalweekdays; colnum++) {
				try {
				CalendarDay = driver.findElement(By.xpath(before_xpath+rownum+after_xpath+colnum+"]")).getText();
				} catch(NoSuchElementException E) {
					System.out.println("Please enter a correct date");
					flag = false;
					break;
				}
				System.out.println(CalendarDay);
				
				if (CalendarDay.equals(day)) {
					driver.findElement(By.xpath(before_xpath+rownum+after_xpath+colnum+"]")).click();
					flag = true;
					break;
				}
			}
		if (flag=true) {
			break;
		}
			
		}
		
	}

}
