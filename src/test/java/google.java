import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.base;

public class google extends base{
	
	static WebDriver driver;
	@Test
	public static void getgoogle () throws IOException
	{
		google gc=new google();
		driver=gc.initializeDriver();
		driver.get("https://www.google.com/");
		String text=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).getText();
		System.out.println(text);
	}

}
