package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {
public WebDriver driver;
	
	//Constructor
	Login_page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// locators
	By logo_loc=By.xpath("//b[normalize-space()='JALA Academy']");
	By txt_Email_loc=By.id("UserName");
	By txt_Password_loc=By.name("Password");
	By btn_Sign_In_loc=By.xpath("//button[@id='btnLogin']");
	By check_RememberMe_loc=By.cssSelector("span.checkmark");
	By link_ForgotPassword_loc=By.linkText("Forgot Password");
	By link_AdminLogin_loc=By.linkText("Admin Login");
	
	
	
	//Action methods
	public boolean checkLogoPresence()
	{
		boolean status=driver.findElement(logo_loc).isDisplayed();
		return status;
	}
	public void setEmail(String username)
	{
		driver.findElement(txt_Email_loc).sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		driver.findElement(txt_Password_loc).sendKeys(password);
	}
	
	public void clickSignIn()
	{
		driver.findElement(btn_Sign_In_loc).click();
	}
	public void RememberMe()
	{
		driver.findElement(check_RememberMe_loc).click();
	}
	public void ForgotPassword()
	{
		driver.findElement(link_ForgotPassword_loc).click();
	}
	public void AdminLogin()
	{
		driver.findElement(link_AdminLogin_loc).click();
	}
	
	
	
	
}
