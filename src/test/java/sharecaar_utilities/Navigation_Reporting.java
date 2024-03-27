package sharecaar_utilities;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Navigation_Reporting implements ITestListener{
	//Step1:gives the extent report information
	//gives UI part of the report--Title, doc-name, color...
	public ExtentSparkReporter reporter;
	//gives information about the user
	public ExtentReports extent;
	//gives the status--pass/fail/skip
	public ExtentTest test;
	public void onStart(ITestContext context) 
	{
		//give the report target location
		reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\NavigationReport.html");

		//Title of the report
		reporter.config().setDocumentTitle("Automation Testing Report");

		//report name
		reporter.config().setReportName("Functional Testing");

		//set the Theme
		reporter.config().setTheme(Theme.DARK);

		//user information
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester", "Prabhavathi");
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Browser", "Chrome");
	}
	//Step2:uses the by default methods
	public void onTestSuccess(ITestResult tr) 
	{
		//create the new entry to the report
		test=extent.createTest(tr.getName());
		test.log(Status.PASS,"Testcases is success:"+ tr.getName());
	}

	public void onTestFailure(ITestResult tr)
	{
		test=extent.createTest(tr.getName());
		test.log(Status.FAIL, "Testcase is failed: "+ tr.getName());
		test.log(Status.FAIL, "exception is : "+ tr.getThrowable());
		String Screenshotpath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
		File f=new File(Screenshotpath);
		if(f.exists()) 
		{
			try 
			{
				test.fail("screenshot is below:"+test.addScreenCaptureFromPath(Screenshotpath));
			}
			catch(Exception e) 
			{
				e.printStackTrace();

			}
		}
	}
	public void onTestSkip(ITestResult tr) 
	{
		test=extent.createTest(tr.getName());
		test.log(Status.SKIP, "Testcase is Skipped: "+ tr.getName());
	}

	public void onFinish(ITestContext context) 
	{
		extent.flush();
	}


	


}
