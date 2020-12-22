package pk_UI_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Verify_Text_Color_Before_After_Click {
	@Test
	public void Verify_Text_Color_Before_After() throws InterruptedException
	
	{
		WebDriverManager.chromedriver().setup();ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shutterfly.com/home-decor");
		String ActColorCode=driver.findElement(By.name("&lid=GlobalHeader_HomeDecor")).getCssValue("Color");
		System.out.println("Color code in RGB" + ActColorCode);
		String ExpColorCodeInRGB= "rgb(240, 83, 35)";
		Assert.assertEquals(ActColorCode, ExpColorCodeInRGB);
		//Thread.sleep(6000);
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe[class*='ab-in-app-message']")));
        if(driver.findElement(By.cssSelector("iframe[class*='ab-in-app-message']")).isDisplayed()) {
        	
        	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class*='ab-in-app-message']")));
        	WebElement ele =driver.findElement(By.name("sFlyPushNo"));
            js.executeScript("arguments[0].click()", ele);
            driver.switchTo().defaultContent();
        }

		WebElement kidele=driver.findElement(By.cssSelector("li.catItem>[name='&lid=GlobalHeader_Kids']"));
		js.executeScript("arguments[0].click()", kidele);
		String AftClickColorCode=driver.findElement(By.name("&lid=GlobalHeader_Kids")).getCssValue("Color");
		Assert.assertNotEquals(AftClickColorCode, ExpColorCodeInRGB);
		//Assert.assertEquals(AftClickColorCode, ExpColorCodeInRGB);
		driver.quit();

	}

}
