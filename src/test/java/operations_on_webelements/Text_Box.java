package operations_on_webelements;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text_Box {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //Open Url
		 driver.get("https://magnus.jalatechnologies.com/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 //Jala Academy Title and URL
		 System.out.println("Title of the Page: "+driver.getTitle());
		 System.out.println("Url of the Page: "+driver.getCurrentUrl());
		
		 //Email or Phone No
		 WebElement Email=driver.findElement(By.id("UserName"));//[//input[@id='UserName']]
		 Email.clear();
		 Email.sendKeys("training@jalaacademy.com");
		 
		 //Password
		 WebElement Pwd=driver.findElement(By.name("Password"));//input[@id='Password']
		 Pwd.clear();
		 Pwd.sendKeys("jobprogram");
		 
		 
		//Sign in Button
		 driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		 
		 String Act_Title="Magnus";
         String Expected_Title=driver.findElement(By.xpath("/html/body/div[2]/header/a/span[2]/b")).getText();
		 
		 if(Act_Title.equals(Expected_Title))
		 {
			 System.out.println("Login Successful");
			 
		 }
		 else
		 {
			 System.out.println("Test Failed");
		 }
		 //Click on employee
		 driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click();
		
		 //Click on Create
		 driver.findElement(By.xpath("//a[normalize-space()='Create']")).click();
		 
		 //Check if Text Box is enabled/disabled
		 driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		 
		//First Name
		 WebElement First_Name=driver.findElement(By.xpath("//input[@id='FirstName']"));
		 
		 //Check if Text Box is enabled/disabled
		 System.out.println("First Name Textbox is enabled :"+First_Name.isEnabled());
		 
		  First_Name.sendKeys("Junnie");
	     
		  //How to get a Text Box value using Selenium Web Driver
		  
		  System.out.println("Value of the First_Name Textbox is :"+First_Name.getAttribute("value"));
		
		  
		  //Last Name
		WebElement Last_Name=driver.findElement(By.xpath("//input[@id='LastName'][@name='LastName']"));
		Last_Name.sendKeys("June");
		
		//How to read the placeholder value of a Text Box using getAttribute() method
		//Email
		WebElement Email_id=driver.findElement(By.xpath("//input[@id='EmailId']"));
		System.out.println("Placeholder value of a Email TextBox is :" +Email_id.getAttribute("placeholder"));
		
		//Deleting/clear text from the Text Box
		First_Name.clear();
		
	}

}
