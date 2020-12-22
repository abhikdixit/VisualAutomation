package pk_UI_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Element_Focused_Or_Not {
@Test(priority=1)
	public void Google_Search_Focus() {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/");
		
		WebElement element = driver.findElement(By.name("q"));
		// Verify Search box is focused or not
		element.equals(driver.switchTo().activeElement());
		driver.quit();
	}

@Test
public void Login_Edit_Focus() {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	WebElement element=driver.findElement(By.name("txtUsername"));
	element.equals(driver.switchTo().activeElement());
	driver.quit();
}
}
