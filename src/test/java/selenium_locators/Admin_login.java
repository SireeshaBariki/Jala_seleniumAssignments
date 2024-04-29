package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Admin_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //Open Url
		 driver.get("https://magnus.jalatechnologies.com/");
		 
		 //Jala Academy
		 WebElement Display=driver.findElement(By.xpath("//b[normalize-space()='JALA Academy']"));//Returns Boolean Value
		 System.out.println(Display.isDisplayed());
		 
		//Admin Login
		 driver.findElement(By.linkText("Admin Login")).click();
		 
		 System.out.println(driver.getTitle());// Admin Login
		 System.out.println(driver.getCurrentUrl());// https://magnus.jalatechnologies.com/Account/AdminLogin
		
		 
		 
		 
		 driver.quit();
	}

}
