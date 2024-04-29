package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginfacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Lauch Browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

				// Open Url
				driver.get("https://www.facebook.com/");
				Thread.sleep(3000);
				
				
				// Login Button
				WebElement LoginButton=driver.findElement(By.xpath("//button[@id='loginbutton']"));
				//WebElement LoginButton=driver.findElement(By.id("loginbutton"));
				
				// obtain color in rgba
				String s = LoginButton.getCssValue("color");
				
				// convert rgba to hex
				String c = Color.fromString(s).asHex();
				
				System.out.println("Color is :" + s);
				System.out.println("Hex code for color:" + c);
				driver.quit();

			
	}

}
