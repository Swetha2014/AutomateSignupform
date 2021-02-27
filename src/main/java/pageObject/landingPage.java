package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
	public WebDriver driver;
	
	By signin=By.xpath("//span[contains(text(),'Login')]");
	By register=By.xpath("//span[contains(text(),'Register')]");
	By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	By navBar=By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	By popup=By.xpath("//button[contains(text(),'NO THANKS')]");
	
	public landingPage(WebDriver driver)
			
	{
		this.driver=driver;
	}



	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	public WebElement register()
	{
		return driver.findElement(register);
	}


	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement navigate()
	{
		return driver.findElement(navBar);
	}
	
	public List<WebElement> getpopupSize()
	{
		return driver.findElements(popup);
	}
	
	public WebElement getpopup()
	{
		return driver.findElement(popup);
	}
}
