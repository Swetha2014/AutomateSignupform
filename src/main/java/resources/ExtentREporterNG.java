package resources;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import Academy.E2EProject.ExtentSparkReporter;

public class ExtentREporterNG extends base{
	static ExtentReports extent;

	public static ExtentReports getReportObject()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		//ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		extent=new  ExtentReports();
	     extent=new ExtentReports();
	     extent.setSystemInfo("Tester", "hdfhgsdhfv");
	     return extent;
	     
	}
	@Test
	public void initialDemo() throws IOException
	{
		
		initializeDriver();
        driver.get("https://rahulshettyacademy.com/#/index");
        System.out.println(driver.getTitle());
        driver.close();
	}

}
