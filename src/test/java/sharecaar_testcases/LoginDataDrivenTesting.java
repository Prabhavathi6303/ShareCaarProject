package sharecaar_testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import sharecaar_pageobjects.LoginPage;
import sharecaar_utilities.XLUtils;

public class LoginDataDrivenTesting extends Login_BaseClass{
	@Test(dataProvider="SharecaarLogin")
	public void DataDrivenLoginTest(String Email, String Password, String Status) throws IOException, InterruptedException
	{
		String path=System.getProperty("user.dir")+"\\src\\test\\java\\sharecaar_testdata\\SharecaarLogin.xlsx";
		LoginPage L=new LoginPage(driver);
		Thread.sleep(2000);
		L.Email(Email);
		Log.info("Email is entered");
		Thread.sleep(2000);
		L.Password(Password);
		Log.info("Password is entered");
		Thread.sleep(5000);
		L.ClickLogin();
		Log.info("Login button is clicked");
		Thread.sleep(1000);
		String exp_result="Profile - Sharecaar";
		String act_result=driver.getTitle();
		if(act_result.equals(exp_result)) 
		{
			Assert.assertTrue(true);
			Log.info("Testcase is Passed");
			for(int i=1;i<=3;i++) 
			{
				String email=XLUtils.getCelldata(path, "Sheet1", i, 0);
				if(email.equals(Email))
				{
					XLUtils.setCellData(path, "Sheet1", i, 2, "Pass");
					XLUtils.FillGreenColor(path, "Sheet1", i, 2);
				}
			}

		}
		else 
		{
			Log.info("Testcase is Failed");
			CaptureScreen(driver,"DataDrivenLoginTest");
			Log.info("Screenshot is taken");
			for(int i=1;i<=3;i++) 
			{
				String email=XLUtils.getCelldata(path, "Sheet1", i, 0);
				if(email.equals(Email))
				{
					XLUtils.setCellData(path, "Sheet1", i, 2, "Fail");
					XLUtils.FillRedColor(path, "Sheet1", i, 2);
				}
			}
			driver.navigate().refresh();
			Assert.assertTrue(false);
		}
	}
	
		
	
	@DataProvider(name="SharecaarLogin")
	String[][]getdata() throws IOException
	{
		String path=System.getProperty("user.dir")+"\\src\\test\\java\\sharecaar_testdata\\SharecaarLogin.xlsx";
		int rownum=XLUtils.getRowcount(path, "Sheet1");
		int colcount=XLUtils.getCellcount(path, "Sheet1", 1);
		String Logindata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++)
		{

			for(int j=0;j<colcount;j++)
			{
				Logindata[i-1][j]=XLUtils.getCelldata(path, "Sheet1", i, j);


			}
		}

        return Logindata;


	}
}


