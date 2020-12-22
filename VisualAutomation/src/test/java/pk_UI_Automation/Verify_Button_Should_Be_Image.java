package pk_UI_Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Verify_Button_Should_Be_Image {
	@Test
	public void Button_Image()
	
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("SIGN-ON")).click();
		String ButtonType=driver.findElement(By.name("login")).getAttribute("type");
		System.out.println(ButtonType);
		Assert.assertEquals(ButtonType, "image");
		driver.quit();

	}

}
