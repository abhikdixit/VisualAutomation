package pk_UI_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Verify_Text_Color {
	@Test
	public void Sign_On_Text_Color()
	
	{
		
		WebDriverManager.chromedriver().setup();ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Login to Application
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String ActColorCode=driver.findElement(By.id("welcome")).getCssValue("Color");
		System.out.println("Color code in RGB=" + ActColorCode);
		String ExpColorCodeInRGB= "rgb(99, 99, 99)";
		Assert.assertEquals(ActColorCode, ExpColorCodeInRGB);
		driver.quit();

	}

}
