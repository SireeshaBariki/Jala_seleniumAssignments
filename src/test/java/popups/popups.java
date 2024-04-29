package popups;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popups {

	public static void main(String[] args) {
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
		 
		 //click on AlertBox
		 /*driver.findElement(By.xpath("//input[@id='alertBox']")).click();
		 
		 Alert alertWindow=driver.switchTo().alert();
		 
		 System.out.println("Message on the AlertBox :"+alertWindow.getText());
		 
		 alertWindow.accept(); */
		 
		 //Click on Confirm Box with ok and cancel
		 
		 /*driver.findElement(By.xpath("//input[@id='confirmBox']")).click();
		 
         Alert alertWindow=driver.switchTo().alert();
		 
		 System.out.println("Message on the AlertBox :"+alertWindow.getText());
		 
		 //alertWindow.accept(); 
		 
		 alertWindow.dismiss(); */
		  //Alert with input box along with ok and cancel
		 /*driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		 Alert alertwindow=driver.switchTo().alert();
		 System.out.println("Message on the AlertBox :"+alertwindow.getText());
		 //alertwindow.clear();
		 
		 alertwindow.sendKeys("Welcome to jala Academy");
		 alertwindow.accept();*/
		 
		 
		 
		 
		 driver.quit();
	}

}
