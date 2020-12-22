package pk_UI_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Title {
	@Test
	public void TitleVerification() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://newtours.demoaut.com/mercurywelcome.php");
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("testing");
		driver.findElement(By.name("password")).sendKeys("testing");
		driver.findElement(By.name("login")).click();

		WebElement element = driver.findElement(By.linkText("SIGN-OFF"));
		String ExpTitle = "Find a Flight: Mercury Tours:";

		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		Assert.assertEquals(ExpTitle, ActTitle);

		element.click();
		driver.quit();
	}
}
