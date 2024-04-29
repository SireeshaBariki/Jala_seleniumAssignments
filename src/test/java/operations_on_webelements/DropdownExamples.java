package operations_on_webelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownExamples {

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
		 
		 //Country Dropdown
		 //Identifying the Element
		 WebElement Countrydrp=driver.findElement(By.xpath("//select[@id='CountryId']"));
		 Select dropdown=new Select(Countrydrp);
		 
		 //Find how many options are present in the given Dropdown
		 System.out.println("Total Number of Options in the Dropdown are:"+dropdown.getOptions().size());
		 
		 //Extract all the options and print them
		 List<WebElement> options=dropdown.getOptions();
		 for(int i=0;i<options.size();i++)
		 {
			 System.out.println(options.get(i).getText());
			/* if(i==1)
			 {
				System.out.println("The First Selected option from the Drpdown is: "+options.get(i).getText); 
			 }*/
			 
			 //dropdown.selectByVisibleText("Bangladesh");
			 //dropdown.selectByValue("2");//Sri Lanka
			 dropdown.selectByIndex(9);//UK
			 //System.out.println("The First Selected option from the Drpdown is: "+options.get(i).getText);
		 }
		 
	}

}
