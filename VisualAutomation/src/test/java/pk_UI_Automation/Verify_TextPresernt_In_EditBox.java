package pk_UI_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_TextPresernt_In_EditBox {
	@Test
	public void FirstName_Placeholder() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");

		WebElement element = driver.findElement(By.id("email"));
		// Verify Search box is focused or not
		String FirstNamePlaceHolder = element.getAttribute("aria-label");
		System.out.println(FirstNamePlaceHolder);
		Assert.assertEquals(FirstNamePlaceHolder, "Email address or phone number");
		driver.quit();
	}
}
