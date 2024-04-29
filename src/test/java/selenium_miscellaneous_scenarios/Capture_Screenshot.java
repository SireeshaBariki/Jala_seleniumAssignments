package selenium_miscellaneous_scenarios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Capture_Screenshot {

	public static void main(String[] args) throws IOException {
	
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //Open Url
		 driver.get("https://magnus.jalatechnologies.com/");
//Capture Fullpage 
	    /*TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\Admin\\eclipse-workspace\\Jala_Assignments\\Screenshots\\fullpage.png");
		FileUtils.copyFile(src, trg);*/
	//capture screenshot of specific area from webpage	
		WebElement Login_Body=driver.findElement(By.xpath("//div[@class='login-box-body']"));
		File src=Login_Body.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\Admin\\eclipse-workspace\\Jala_Assignments\\Screenshots\\Login_Body.png");
		FileUtils.copyFile(src, trg);
	}
	

}
