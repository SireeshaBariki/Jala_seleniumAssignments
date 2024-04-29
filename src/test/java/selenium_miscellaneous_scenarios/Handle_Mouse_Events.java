package selenium_miscellaneous_scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Mouse_Events {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement WomenEthnic=driver.findElement(By.xpath("//span[normalize-space()='Women Ethnic']"));
		
		WebElement AllSarees=driver.findElement(By.xpath("//p[normalize-space()='All Sarees']"));
		
		Actions act=new Actions(driver);
		//Mousehover
		act.moveToElement(WomenEthnic).moveToElement(AllSarees).click().build().perform();*/
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act=new Actions(driver);
		
		//right click
		act.contextClick(button).perform();

		
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click(); // click on copy option
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept(); // close alert window
	}

}
