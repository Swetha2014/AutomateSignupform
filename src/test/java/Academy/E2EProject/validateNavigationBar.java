package Academy.E2EProject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.landingPage;
import pageObject.loginPage;
import resources.base;

public class validateNavigationBar extends base{
	
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialization() throws IOException
	{
         driver= initializeDriver();
		
		driver.get("http://www.qaclickacademy.com/");	
	}
	
	@SuppressWarnings("deprecation")
	@Test()
	public void  basePageNavigation() throws IOException
	{
				
		landingPage l=new landingPage(driver);
	Assert.assertTrue(l.navigate().isDisplayed());
		//Assert.assertEquals(l.getTitle().getText(),"Featured Courses");//(title, "Featured Courses");
	log.info("navigation bar is displayed");
		
			
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}