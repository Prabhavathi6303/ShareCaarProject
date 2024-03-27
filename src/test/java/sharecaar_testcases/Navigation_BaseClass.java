package sharecaar_testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import sharecaar_utilities.Navigation_ReadConfig;

public class Navigation_BaseClass {
	public static WebDriver driver;
	public static Logger Log;
	Navigation_ReadConfig rc=new Navigation_ReadConfig();
	public String URL=rc.getApplicationURL();
	public String Email=rc.getEmail();
	public String Password=rc.getPassword();
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
	
	

}
