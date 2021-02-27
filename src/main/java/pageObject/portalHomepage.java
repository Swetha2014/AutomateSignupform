package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class portalHomepage {
	
	public WebDriver driver;
	
	By searchbox=By.xpath("//input[@id='search-courses']");
	
	
	


	public portalHomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
	
	public WebElement getsearchbox()
	{
		return driver.findElement(searchbox);
	}

}
