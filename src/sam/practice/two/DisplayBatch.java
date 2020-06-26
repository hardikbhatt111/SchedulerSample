package sam.practice.two;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayBatch {
	
WebDriver driver;
	
	@Test
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\habhatt\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.seleniumhq.org");
		driver.manage().window().maximize();
		Assert.assertEquals("123", "1234");
	}

}
