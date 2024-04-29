package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Forgot_Password {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //Open URL
		 driver.get("https://magnus.jalatechnologies.com/");
		 
		 //Jala Academy
		 WebElement Display=driver.findElement(By.xpath("//b[normalize-space()='JALA Academy']"));//Returns Boolean Value
		 System.out.println(Display.isDisplayed());
		 
		 driver.getTitle();
		 
		 
		 //Email or Phone No
		 WebElement Email=driver.findElement(By.id("UserName"));//[//input[@id='UserName']]
		 Email.clear();
		 Email.sendKeys("training@jalaacademy.com");
		 
		 //Password
		/* WebElement Pwd=driver.findElement(By.name("Password"));//input[@id='Password']
		 Pwd.clear();
		 Pwd.sendKeys("jobprogram");
		 
		 Thread.sleep(3000);
		 
		//Sign in Button
		 driver.findElement(By.xpath("//button[@id='btnLogin']")).click(); */
		
		 //Forgot Password
		 driver.findElement(By.linkText("Forgot Password")).click();
		 Thread.sleep(2000);
		 
		 System.out.println(driver.getTitle());// Forgot your password?
		 System.out.println(driver.getCurrentUrl());//https://magnus.jalatechnologies.com/Account/ForgotPassword
		//p[@class='login-box-msg']--->Forgot Password
		 
		 driver.quit();
	}

}
