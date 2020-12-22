package pk_UI_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_Back_Forward_Example {
	ChromeDriver driver;

	@BeforeTest
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();

		// System.setProperty("webdriver.chrome.driver","D:\\F Drive\\Selenium
		// Training Data\\workspace\\Allianz_UI_Testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
	}

	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}

	@Test
	public void Flight_Sign_On() throws InterruptedException

	{

		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

		WebElement element = driver.findElementByXPath("//span[contains(text(),'Electronics')]");

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();
		Thread.sleep(6000);
		driver.findElementByXPath("//a[@title='Samsung']").click();
		Thread.sleep(6000);
		// String SamActValue=
		// driver.findElement(By.xpath("//h1[@id='container]/div/div[3]/div[2]/h1")).getText();
		String SamActValue = driver.findElement(By.xpath("//h1[contains(text(),'Samsung Mobile Phones')]")).getText();
		System.out.println(SamActValue);
		// Navigation Back with Verifiation

		driver.navigate().back();

		// Navigation Forward with Verification
		// driver.navigate().forward();

	}

}
