package popups;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //Open URL
		 driver.get("https://magnus.jalatechnologies.com/");
		 
		 //JALA Academy
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
		 
			 
		//Sign in Button
		 driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
		 
		
		 String Act_Title="Magnus";
		 
		 //String Expected_Title=driver.findElement(By.xpath("[@class='logo-lg font_20']//b[contains(text(),'Magnus')]")).getText();
		 String Expected_Title=driver.findElement(By.xpath("/html/body/div[2]/header/a/span[2]/b")).getText();
		 
		 if(Act_Title.equals(Expected_Title))
		 {
			 System.out.println("Login Successful");
			 
		 }
		 else
		 {
			 System.out.println("Test Failed");
		 }
		 
		//click on More Link
		 driver.findElement(By.xpath("//a[normalize-space()='More']")).click();
		 
		 //click on PopUp link
		 driver.findElement(By.xpath("//a[@href='/Home/Popup']")).click();
		 
		 String ParentHandle=driver.getWindowHandle();
		 System.out.println("Parent window:"+ParentHandle);
		 //Click on Popup one
		 driver.findElement(By.xpath("//a[@id='btn-one']")).click();
		 Set<String> Handles=driver.getWindowHandles();
		 
		 for(String handle:Handles)
		 {
			 System.out.println(handle);
			 if(!handle.equals(ParentHandle))
			 {
				 driver.switchTo().window(handle);
				 driver.manage().window().maximize();
				 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Jala Academy");
				 Thread.sleep(5000);
				 driver.close();
				 
			 }
		 }
		 
		 driver.switchTo().window(ParentHandle);
		 Thread.sleep(2000);
		 driver.quit();
		 
	}

}
/*true
Login Successful
Parent window:DCED2003A32DD0E4E0E08C57273D3EF6
DCED2003A32DD0E4E0E08C57273D3EF6
39EAE705B48F62F668546414B138B47E */