package selenium_locators;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Invalid_Email {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //Open URL
		 driver.get("https://magnus.jalatechnologies.com/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 //JALA Academy Title and URL
		 System.out.println("Title of the Page: "+driver.getTitle());
		 System.out.println("Url of the Page: "+driver.getCurrentUrl());
		 
		//Email or Phone No
		 WebElement Email=driver.findElement(By.id("UserName"));//[//input[@id='UserName']]
		 Email.clear();
		 Email.sendKeys("sireeshaswapna.com");
		 
		 //Password
		 WebElement Pwd=driver.findElement(By.name("Password"));//input[@id='Password']
		 Pwd.clear();
		 Pwd.sendKeys("jobprogram");
		 
		 //Please enter email or mobile no.
		 //driver.findElement(By.xpath("span[@for='UserName']")).getText();
		 
		//Sign in Button
		 driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		  
		 Thread.sleep(1000);
		 
		 
		 //Please enter valid email and password
		 String Expected_message=driver.findElement(By.xpath("//div[@class='toast-title']")).getText();
		 System.out.println("Expected Message: "+Expected_message);
		 
		 String Actual_message="Invalid Email address or Password.";
		 
		 if(Actual_message.equals(Expected_message))
		 {
			System.out.println("Enter the valid Email address or Password"); 
		 }
		 else
		 {
			System.out.println("Test Failed"); 
		 }
		 
		
		 
		driver.close();
		 
	}

}
