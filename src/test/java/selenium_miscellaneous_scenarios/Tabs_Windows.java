package selenium_miscellaneous_scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tabs_Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://www.opencart.com/");
		
		driver.switchTo().newWindow(WindowType.TAB); // OPENS NEW TAB
		//driver.switchTo().newWindow(WindowType.WINDOW); // OPENS IN ANOTHER WINDOW
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}
