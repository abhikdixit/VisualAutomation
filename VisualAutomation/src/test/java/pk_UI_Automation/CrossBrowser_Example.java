package pk_UI_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowser_Example {
WebDriver driver;
	
	@BeforeTest
    @Parameters("browser")
    public void setup(String browser) throws Exception {
		
        if(browser.equalsIgnoreCase("firefox")){
   		 System.setProperty("webdriver.gecko.driver","D:\\F Drive\\Selenium Training Data\\workspace\\Allianz_UI_Testing\\geckodriver.exe");
   		 driver = new FirefoxDriver();
        }
       else if(browser.equalsIgnoreCase("chrome")){
    		 System.setProperty("webdriver.chrome.driver","D:\\F Drive\\Selenium Training Data\\workspace\\Allianz_UI_Testing\\chromedriver.exe");
    			driver = new ChromeDriver();
        }

        else{

            //If no browser passed throw exception

            throw new Exception("Browser is not correct");
        }

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void Guru_Login() {

		String baseurl = "http://newtours.demoaut.com/mercurywelcome.php";
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("testing");
		driver.findElement(By.name("password")).sendKeys("testing");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("SIGN-OFF")).click();

	}
	  @AfterTest
	  public void CloseBrowser() {
		  driver.quit();
	  }

}
