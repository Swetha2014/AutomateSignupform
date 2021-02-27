package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import pageObject.landingPage;
import pageObject.loginPage;
import pageObject.portalHomepage;
import resources.base;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepdefinition extends base{

	               
           
        
@Given("^Initialize the browser with chrome$")
public void initialize_the_browser_with_chrome() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  
    driver= initializeDriver();
}

@Given("^Navigate to \"([^\"]*)\" site$")
public void navigate_to_site(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.get(arg1);
}

@Given("^click on login link in homepage to land on secure signin page$")
public void click_on_login_link_in_homepage_to_land_on_secure_signin_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
    
    landingPage l=new landingPage(driver);
	//System.out.println(l.getTitle().getText());
    if(l.getpopupSize().size()>0)
    {
    	l.getpopup().click();
    }
	l.getLogin().click();
}

/*@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
public void user_enters_and_and_logs_in(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
    
    loginPage lp=new loginPage(driver);
	lp.getEmail().sendKeys(arg1);
	lp.getPassword().sendKeys(arg2);
	lp.login().click();
	//log.info("login successfull");
	//driver.close();
}*/

@When("^User enters (.+) and (.+) and logs in$")
public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
	  loginPage lp=new loginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.login().click();
}





@Then("^Verify that user is successfully logged in$")
public void verify_that_user_is_successfully_logged_in() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   portalHomepage p=new portalHomepage(driver);
  Assert.assertTrue(p.getsearchbox().isDisplayed()); 
}

@And("^close browsers$")
public void close_browsers() throws Throwable {
    driver.quit();
    
    
}
}

        

    

