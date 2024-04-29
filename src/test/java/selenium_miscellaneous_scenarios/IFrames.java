package selenium_miscellaneous_scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
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
		 
		//click on More_Link
		 driver.findElement(By.xpath("//a[normalize-space()='More']")).click();
		 
		//click on iFrames_Link
		 driver.findElement(By.xpath("//a[normalize-space()='iFrames']")).click();
		 
		 Thread.sleep(1000);
		 
		//click on iFrame1_Link
		 /*driver.findElement(By.xpath("//iframe[@id='iframe1']")).click();
		 
		 driver.switchTo().defaultContent();*/
		 
		
		//click on iFrame2_Link
		 WebElement Frame2=driver.findElement(By.xpath("//iframe[@id='iframe2']"));
		 driver.switchTo().frame(Frame2);
		driver.findElement(By.xpath("//a[@role='button']")).click();
		 
		
	}

}
