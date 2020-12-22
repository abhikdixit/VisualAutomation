package pk_UI_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Verify_EditBox_Height_Width {
	@Test
	public void Button_Height_Width()
	
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		String ActUserNameHeight=driver.findElement(By.id("btnLogin")).getCssValue("height");
		System.out.println("Height of UserName=" + ActUserNameHeight);
		String ActUserNameWidth=driver.findElement(By.id("btnLogin")).getCssValue("width");
		System.out.println("Width of UserName=" + ActUserNameWidth);
		Assert.assertEquals(ActUserNameHeight, "26px");
		Assert.assertEquals(ActUserNameWidth, "94px");
		driver.quit();
	}
	
}
