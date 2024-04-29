package selenium_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidEmail_BlankPassword {

	public static void main(String[] args) {
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
		 /*WebElement Pwd=driver.findElement(By.name("Password"));//input[@id='Password']
		 Pwd.clear();
		 Pwd.click(); */
		 
		 //Sign in Button
		 driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		 
		 //Please Enter Password
		 String PasswordText=driver.findElement(By.xpath("//div[@class='toast-title']")).getText();
		 System.out.println("Expected_Text:" +PasswordText);
		 
		 driver.close();
	}

}
