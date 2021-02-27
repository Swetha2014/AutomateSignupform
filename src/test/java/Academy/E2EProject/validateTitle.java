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

public class validateTitle extends base{
	public WebDriver driver;
	
	public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialization() throws IOException
	{
         driver= initializeDriver();
		log.info("Driver is initialized");
		driver.get("http://www.qaclickacademy.com/");	
		log.info("url is opened");
		//Assert.fail(" jhbfufd");
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void  basePageNavigation() throws IOException
	{
		
		
		landingPage l=new landingPage(driver);
		//String title=l.getTitle().getText();
		Assert.assertEquals(l.getTitle().getText(),"FEATURED COURSES");//(title, "Featured Courses");
		log.info("successfully validated the title");
		
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
}