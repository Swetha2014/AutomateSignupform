package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class register {
	
				
		public WebDriver driver;
		
		By fullname_textbox=By.xpath("//input[@id='user_name']");
		By useremail_textbox=By.xpath("//input[@id='user_email']");
		By userpassword_textbox=By.xpath("//input[@id='user_password']");
		By userpasswordconfirm_textbox=By.xpath("//input[@id='user_password_confirmation']");
		By promotional_checkbox=By.xpath("//input[@id='user_unsubscribe_from_marketing_emails']");
		By privacypolicy_checkbox=By.xpath("//input[@id='user_agreed_to_terms']");
		By signup=By.xpath("//input[@value='Sign Up']");
				

		public register(WebDriver driver1) {
			// TODO Auto-generated constructor stub
			
			this.driver=driver1;
		}
		public WebElement getfullname()
		{
			return driver.findElement(fullname_textbox);
			
		}
		
		public WebElement getuseremail()
		{
			return driver.findElement(useremail_textbox);
			
		}
		public WebElement getuserpassword()
		{
			return driver.findElement(userpassword_textbox);
			
		}
		public WebElement getuserpasswordconfirm()
		{
			return driver.findElement(userpasswordconfirm_textbox);
			
		}
		public WebElement getpromotional()
		{
			return driver.findElement(promotional_checkbox);
			
		}
		public WebElement getprivacypolicy()
		{
			return driver.findElement(privacypolicy_checkbox);
			
		}
		
		public WebElement signup()
		{
			return driver.findElement(signup);
		}

	}



