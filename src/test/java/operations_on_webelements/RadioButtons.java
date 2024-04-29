package operations_on_webelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*1. Selecting the Radio Button by Label Text / value
  2. Find out number of elements in a radio group
  3. Find out all radio button values
  4. How to get the selected radio button label text?
  5. Check if Radio Button is selected?
  6. Check if Radio Button is enabled or disabled? */
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
		 
		 //RadioButtons
		 //Male Radio Button
		 WebElement Malerdbutton=driver.findElement(By.xpath("//input[@id='rdbMale']"));
		 		 		 
		 System.out.println("Male Radio Button is Displayed : "+Malerdbutton.isDisplayed());
		 System.out.println("Male Radio Button is Enabled   : "+Malerdbutton.isEnabled());
		 System.out.println("Male Radio Button is selected  : "+Malerdbutton.isSelected());
		 
		 //Female Radio Button
		 WebElement Femalerdbutton=driver.findElement(By.xpath("//input[@id='rdbFemale']"));
		 System.out.println("Whether Female Radio Button is selected or not  : "+Femalerdbutton.isSelected());
		 System.out.println("Female Radio Button is Displayed : "+Femalerdbutton.isDisplayed());
		 System.out.println("Female Radio Button is Enabled   : "+Femalerdbutton.isEnabled());
		 Femalerdbutton.click();
		 System.out.println("Female Radio Button is selected  : "+Femalerdbutton.isSelected());
		 
		 //How to get the selected radio button label text?
		 System.out.println("Selected Radio Button Label Text :"+Femalerdbutton.getText());
		 
		 //Find out number of elements in a radio group
		 List<WebElement> Totalrd=driver.findElements(By.xpath("//div[@class='col-md-4 form-group mt_25']//input[contains(@type,'radio')]"));
	     System.out.println("Total number of radio buttons:"+Totalrd.size());
	     
	     //Find out all radio button values
	     for( int i=0;i<=Totalrd.size();i++)
	     {
	    	 System.out.println("The value of the Radio button is:"+Totalrd.get(i).getAttribute("value"));
	    	 System.out.println("The label text of Radio buttion is:"+Totalrd.get(i).getText());
	     }
	     driver.quit();
	} 

}
