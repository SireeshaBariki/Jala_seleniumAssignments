package selenium_miscellaneous_scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_Table {

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
		 
		 //Employee link
		 driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click();
		 
		 //Search_Link
		 driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
		 
		 Thread.sleep(1000);
		 
		 
		 //Find Total number of Pages
		 
		 String Pages=driver.findElement(By.xpath("//span[@class='pull-right spanPageNum hovered']")).getText();
		 int total_pages=Integer.parseInt(Pages.substring(Pages.indexOf(" ")+1,Pages.indexOf("Pages")-1));
		 System.out.println("Total Number of pages :"+total_pages);
		 
		 
		 for(int p=1;p<=5;p++)// for(int p=1;p<=total_pages;p++)
		 {
			 if(total_pages>1) 
			 {
			 WebElement active_page=driver.findElement(By.xpath("//table[@id='tblEmployee']"));
			 System.out.println("Active page" +active_page.getText());
			 driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
			 Thread.sleep(1000);
			 }
			 int noofrows=driver.findElements(By.xpath("//table[@id='tblEmployee']//tr")).size();
			 System.out.println("Total no of rows in active pages:" +noofrows);
			 /*for(int r=1;r<=noofrows;r++)
			 {
				 String FirstName=driver.findElement(By.xpath("//table[@id='tblEmployee']//tr//td[1]")).getText();
				 String LAstNAme=driver.findElement(By.xpath("//table[@id='tblEmployee']//tr//td[2]")).getText();
				 
				 String Emailid=driver.findElement(By.xpath("//table[@id='tblEmployee']//tr//td[3]")).getText();
			 }*/
			 
		 }
			 }
	}
	


