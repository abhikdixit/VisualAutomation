package pk_UI_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_EditBox_MaxLength {
	@Test
	public void Sign_On_Text_Color()
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
		// Locating firstname web element
		driver.findElement(By.linkText("SIGN-ON")).click();
		WebElement firstNameInputbox = driver.findElement(By.name("userName"));
		
		/***************** Option 1 ********************************/
		 
		// Type more than 60 characters,as max limit is defined as 60 as per requirement
		firstNameInputbox.sendKeys("Makeseleniumeasy1234Makeseleniumeasy1234Makeseleniumeasy12345");
		String EnteredValue = firstNameInputbox.getAttribute("value");
		int EnteredValueSize=EnteredValue.length();
		System.out.println("User Name Value entered size ="+EnteredValueSize);
		// Get the typed value
		String typedValue = firstNameInputbox.getAttribute("value");
		System.out.println("User Name Value entered ="+typedValue);
		// Get the length of typed value
		int size = typedValue.length();
 
		// Assert with expected
		if (size == 60) {
			System.out.println("Maxlength character functionality is working fine.");
		}
 
		else {
			System.out.println("No limit is set.");
		}
 
		/************************ Way 2 ********************************************/
 
		// Clear already typed value.
		firstNameInputbox.clear();
		;
 
		// Get maxlength attribute of input box
		String maxLengthDefined = firstNameInputbox.getAttribute("maxlength");
 
		if (maxLengthDefined == null) {
			System.out.println("No limit is set.");
		}
 
		else {
			if (maxLengthDefined.equals("60")) {
				System.out.println("Max character limit is set as expected.");
			}
		}
 
		driver.quit();
	}

}
