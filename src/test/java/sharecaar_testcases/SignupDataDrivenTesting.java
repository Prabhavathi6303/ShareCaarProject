package sharecaar_testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import sharecaar_pageobjects.SignupPage;
import sharecaar_utilities.XLUtils;

public class SignupDataDrivenTesting extends Signup_BaseClass {
	@Test(dataProvider="ShareCaarSignup")
	public void SignupTest1(String FName, String LName, String Email, String Contact, String Password, String Cpwd, String Status) throws IOException, InterruptedException
	{
		String path=System.getProperty("user.dir")+"\\src\\test\\java\\sharecaar_testdata\\ShareCaarSignup.xlsx";
		SignupPage S=new SignupPage(driver);
		Thread.sleep(1000);
		S.FirstName(FName);
		Log.info("FirstName is entered");
		Thread.sleep(1000);
		S.LastName(LName);
		Log.info("LastName is entered");
		Thread.sleep(1000);
		S.Email(Email);
		Log.info("Email is entered");
		Thread.sleep(1000);
		S.ContactNumber(Contact);
		Log.info("ContactNumber is entered");
		Thread.sleep(1000);
		S.Password(Password);
		Log.info("Password is entered");
		Thread.sleep(1000);
		S.ConfirmPassword(Cpwd);
		Log.info("ConfirmPassword is entered");
		Thread.sleep(1000);
		S.RadioButton();
		Log.info("Radiobutton is clicked");
		Thread.sleep(18000);
		S.SignupBtn();
		Log.info("Signup button is clicked");
	
		String exp_result="Login - Sharecaar";
		String act_result=driver.getTitle();
		if(act_result.equals(exp_result)) 
		{
			Assert.assertTrue(true);
			Log.info("Testcase is Passed");
			for(int i=1;i<=7;i++) 
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
			CaptureScreen(driver,"SignupTest1");
			Log.info("Screenshot is taken");
			for(int i=1;i<=7;i++) 
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
	@DataProvider(name="ShareCaarSignup")
	String[][]getdata() throws IOException
	{
		String path=System.getProperty("user.dir")+"\\src\\test\\java\\sharecaar_testdata\\ShareCaarSignup.xlsx";
		int rownum=XLUtils.getRowcount(path, "Sheet1");
		int colcount=XLUtils.getCellcount(path, "Shhet1", 1);
		String Signupdata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++)
		{

			for(int j=0;j<colcount;j++)
			{
				Signupdata[i-1][j]=XLUtils.getCelldata(path, "Sheet1", i, j);


			}
		}

		return Signupdata;


	}


}
