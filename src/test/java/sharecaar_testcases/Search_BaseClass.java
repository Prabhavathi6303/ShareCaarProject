package sharecaar_testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import sharecaar_utilities.Search_ReadConfig;

public class Search_BaseClass {
	public static WebDriver driver;
	public static Logger Log;
	Search_ReadConfig rc=new Search_ReadConfig();
	public String URL=rc.getApplicationURL();
	public String From=rc.getFrom();
	public String To=rc.getTo();
	public String Date=rc.getDate();
	public String Email=rc.getEmail();
	public String Password=rc.getPassword();
	public String StartingLocation=rc.getStartingLocation();
	public String Destination=rc.getDestination();
	public String OnwardDate=rc.getOnwardDate();
	public String OnwardTime=rc.getOnwardTime();
	public String ReturnDate=rc.getReturnDate();
	public String ReturnTime=rc.getReturnTime();
	@BeforeClass
	@Parameters("browser")
	public void OpenApplication(String br)
	{
		if(br.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(br.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		driver.manage().window().maximize();
		Log=Logger.getLogger(this.getClass());
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\Log4j.properties");
	}
	@AfterClass
	public void CloseApplication()
	{
		driver.close();
	}
	public void CaptureScreen(WebDriver driver,String name) throws IOException 
    {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("./Screenshots/"+name+".png");
		FileHandler.copy(src, target);
		Log.info("screenshot is taken for failedtestcase");
	}
	



}

