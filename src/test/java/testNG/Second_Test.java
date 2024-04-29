package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Second_Test {
WebDriver driver;
	
	//@BeforeClass
	@Test(priority=10)
	void openApp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=50)
	void login()
	{
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.name("Password")).sendKeys("jobprogram");
		driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		 
	}
	
	//@AfterClass
	@Test(priority=100)
	void closeApp()
	{
		driver.quit();
	}
}
