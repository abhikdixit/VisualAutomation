package pk_UI_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_TextPresernt_In_EditBox_OrangeHRM {
	@Test
	public void FirstName_Placeholder() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Login to Application
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		WebElement element = driver.findElement(By.name("txtUsername"));
		// Verify text present or not
		String FirstNamePlaceHolder = element.getAttribute("aria-label");
		System.out.println(FirstNamePlaceHolder);
		Assert.assertEquals(FirstNamePlaceHolder, "Username");
		driver.quit();
	}
}
