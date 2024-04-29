package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test {

	WebDriver driver;
	Login_page lp;
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		Thread.sleep(5000);
	}
		@Test(priority=1)
		void testLogo()
		{
			
			lp=new Login_page(driver);
			
			Assert.assertEquals(lp.checkLogoPresence(), true);
		}
		
		
		@Test(priority=2)
		void testLogin() throws InterruptedException
		{
			lp.setEmail("training@jalaacademy.com");
			lp.setPassword("jobprogram");
			lp.clickSignIn();
			
			Thread.sleep(1000);
			Assert.assertEquals(driver.getTitle(),"Magnus");
					
		}
		
		@AfterClass
		void tearDown()
		{
			driver.quit();
		}	
	}

