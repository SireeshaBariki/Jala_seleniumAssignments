package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_Testing {
WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br,String appurl) throws InterruptedException
	{
		if(br.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		/*WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();*/
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(appurl);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	}
		
		
		
		@Test
		void testLogin() throws InterruptedException 
		{
			driver.get("https://magnus.jalatechnologies.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
			driver.findElement(By.name("Password")).sendKeys("jobprogram");
			driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
			
			Thread.sleep(1000);
			String exp_title = "Magnus";
			String act_title = driver.getTitle();

			Assert.assertEquals(exp_title, act_title);
		}
		@AfterClass
		void closeApp()
		{
			driver.quit();
		}
	
}
