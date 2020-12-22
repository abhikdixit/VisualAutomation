package pk_UI_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Password_Error_Store {
	@Test
	public void VerifyPassErrorMessage() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(6000);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElementById("email").sendKeys("abhinay.dixit@hotmail.com");
		driver.findElementById("SubmitLogin").click();
		WebElement element = driver.findElementByXPath("//li[contains(text(),'Password is required.')]");
		String passerror = element.getText();
		System.out.println(" :- " + passerror);

		// Compare toll tip text
		Assert.assertEquals("Password is required.", passerror);
		driver.quit();
	}
}
