package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	public WebDriver driver;
	
	By emailid=By.xpath("//input[@id='user_email']");
	By password=By.xpath("//input[@id='user_password']");
	By submit=By.xpath("//input[@name='commit']");
	
	


	public loginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
	}
	public WebElement getEmail()
	{
		return driver.findElement(emailid);
		
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
		
	}
	public WebElement login()
	{
		return driver.findElement(submit);
	}

}
