package sharecaar_testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import sharecaar_pageobjects.LoginPage;


public class Login_TestCase extends Login_BaseClass{
	@Test(dataProvider="dp")
	public void LoginTest(String Email, String Password) throws IOException, InterruptedException
	{
		LoginPage L=new LoginPage(driver);
		Thread.sleep(2000);
		L.Email(Email);
		Log.info("Email is entered");
		Thread.sleep(2000);
		L.Password(Password);
		Log.info("Password is entered");
		Thread.sleep(9000);
		L.ClickLogin();
		Log.info("Login button is clicked");
		Thread.sleep(1000);
		String exp_result="Profile - Sharecaar";
		String act_result=driver.getTitle();
		
		if(act_result.equals(exp_result)) 
		{
			Assert.assertTrue(true);
			Log.info("Testcase is Passed");
			

		}
		else 
		{
			Log.info("Testcase is Failed");
			CaptureScreen(driver,"LoginTest1");
			Log.info("Screenshot is taken");
			driver.navigate().refresh();
			Assert.assertTrue(false);
		}
	}    
	@DataProvider(name="dp")
	String [][] logindata()
	{

		String data[][]={
				{"prabhavathi@gmail.com","abc@123"},
				{"prabhavathi123@gmail.com","demo@123"},
				{"prabhavathimallepally68@gmail.com","Prabhavathi@123"},


        };
		return data;    
    }
}


