package pk_UI_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_ErrorMessage {
	ChromeDriver driver;	
	@Test
	public void HDFCLAlert_Message() throws Exception
	{
			
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		 driver.switchTo().frame("login_page");
		 driver.findElement(By.xpath("//img[@alt='continue']")).click();
		String ExpTest = driver.switchTo().alert().getText();
		System.out.println(ExpTest);
		Assert.assertEquals("Customer ID  cannot be left blank.", ExpTest);
		driver.switchTo().alert().accept();
		
	}
@BeforeTest
public void LaunchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
}

@AfterTest
public void CloseBrowser() {
	  driver.quit();
}

}
