package Academy.E2EProject;

//import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.landingPage;
import pageObject.loginPage;
import resources.base;

public class homePage extends base{
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialization() throws IOException
	{
		driver= initializeDriver();

		//driver.get("http://www.qaclickacademy.com/");	
		 
	}
	
	@Test(dataProvider="getData")
	public void  basePageNavigation(String username,String password) throws IOException
	{
		//driver.get("http://www.qaclickacademy.com/");	
		
		driver.get("http://www.qaclickacademy.com/");	
		landingPage l=new landingPage(driver);
		//System.out.println(l.getTitle().getText());
		l.getLogin().click();
		loginPage lp=new loginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.login().click();
		log.info("login successfull");
		//driver.close();
		
		
	}
	
	
	
 @DataProvider
 public Object[][] getData()
 {
	 Object[][] data=new Object[1][2];
	 //dataset1
	 data[0][0]="first@username";
	 data[0][1]="pwd1";
	 //dataset2
//Assert.fail("jdfghesgr");
	data[1][0]="second@username";
	 data[1][1]="pwd2";
	 
	 return data;
	 
 }

@AfterTest
public void teardown()
{
	driver.close();
}
	
 }
