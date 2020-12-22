package pk_UI_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_ToolTip {
	@Test
	public void Tooltip() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		// driver.navigate().to("https://docs.seleniumhq.org/");
		Thread.sleep(6000);
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Tooltips')]"));
		// Get tooltip text
		String toolTipText = element.getAttribute("title");
		System.out.println("Tool tip text present :- " + toolTipText);

		// Compare toll tip text
		Assert.assertEquals("That's what this widget is", toolTipText);
		driver.quit();
	}
}
