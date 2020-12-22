package pk_UI_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Text_Color_Before_After_Click_OrangeHRM {
	@Test
	public void Verify_Text_Color_Before_After() throws InterruptedException

	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Login to Application
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		// Get actual color of the Dashboard tab
		String ActColorCode = driver.findElement(By.linkText("Dashboard")).getCssValue("Color");
		System.out.println("Color code in RGB=" + ActColorCode);
		String ExpColorCodeInRGB = "rgb(255, 255, 255)";
		Assert.assertEquals(ActColorCode, ExpColorCodeInRGB);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Admin")).click();
		String AfterColorCode = driver.findElement(By.linkText("Dashboard")).getCssValue("Color");
		System.out.println("Color code in RGB=" + AfterColorCode);
		String PostExpColorCodeInRGB = "rgb(93, 93, 93)";
		Assert.assertEquals(AfterColorCode, PostExpColorCodeInRGB);
		driver.quit();

	}

}
