package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvidersDemo {
WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@Test(dataProvider="dp")
	void testLogin(String email, String pwd) throws InterruptedException
	{
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("UserName")).sendKeys(email);
		driver.findElement(By.name("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		
		Thread.sleep(1000);
		String exp_title = "Magnus";
		String act_title = driver.getTitle();

		Assert.assertEquals(exp_title, act_title);
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	@DataProvider(name="dp")//, indices= {0,1,4}
	String [][] loginData()
	{
		String data[][]= {  
							{ "trainingjalaacademy.com", "program" }, //Invalid Data
							{ "training@academy.com", "job" }, //Invalid Data
							{ "training@jalaacademy.com", "jobprogram" }, //Valid Data
							{ "training@jala.com", "jobprogram" },//Invalid Data
							{ "training@jalaacademy.com", "jobprogram" }  //Valid Data
						};
		
		return data;
	}
	
}
