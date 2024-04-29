package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Remember_me {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //Open Url
		 driver.get("https://magnus.jalatechnologies.com/");
		 
		 //Jala Academy
		 WebElement Display=driver.findElement(By.xpath("//b[normalize-space()='JALA Academy']"));//Returns Boolean Value
		 System.out.println(Display.isDisplayed());
		 
		 //Email or Phone No
		 WebElement Email=driver.findElement(By.id("UserName"));//[//input[@id='UserName']]
		 Email.clear();
		 Email.sendKeys("training@jalaacademy.com");
		 
		 //Password
		 WebElement Pwd=driver.findElement(By.name("Password"));//input[@id='Password']
		 Pwd.clear();
		 Pwd.sendKeys("jobprogram");
		 
		//Remember Me(Tag & Class)
		 driver.findElement(By.cssSelector("span.checkmark")).click();
		 
		 		 
		//Sign in Button
		 driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		 
		 Thread.sleep(3000);
		 
		 System.out.println(driver.getTitle());// Magnus
		 System.out.println(driver.getCurrentUrl());//https://magnus.jalatechnologies.com/Home/Index
		 
	}

}
