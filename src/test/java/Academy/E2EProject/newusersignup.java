package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.landingPage;
import pageObject.loginPage;
import pageObject.register;
import resources.base;

public class newusersignup extends base{
	
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialization() throws IOException
	{
		driver= initializeDriver();

		//driver.get("http://www.qaclickacademy.com/");	
		 
	}
	
	@Test
	public void  signuppagenavigation()
	{
		
		driver.get("http://www.qaclickacademy.com/");	
		driver.manage().window().maximize();
		register reg=new register(driver);
		landingPage lp=new landingPage(driver);
		//System.out.println(l.getTitle().getText());
		WebDriverWait w= new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'NO THANKS')]")));
		if(lp.getpopup().isDisplayed())
		{
			lp.getpopup().click();
		}
		lp.register().click();
		reg.getfullname().sendKeys("Swetha");
		reg.getuseremail().sendKeys("swethajakkula18@gmail.com");
		reg.getuserpassword().sendKeys("password");
		reg.getuserpasswordconfirm().sendKeys("password");
		reg.getprivacypolicy().click();
		reg.getpromotional().click();
		reg.signup().click();
		log.info("signup successful");
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
