package pk_UI_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Verify_Password_EditBox_Masked {
	@Test
	public void Verify_Password_Masked()
	
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String PasswordMasked=driver.findElement(By.name("pass")).getAttribute("type");
		System.out.println(PasswordMasked);
		Assert.assertEquals(PasswordMasked, "password");
		driver.quit();

	}

}
