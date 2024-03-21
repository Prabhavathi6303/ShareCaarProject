package sharecaar_testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import sharecaar_pageobjects.SignupPage;

public class Signup_TestCase extends Signup_BaseClass {
	@Test()
	public void SignupTest2() throws InterruptedException 
	{
		
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
		S.ConfirmPassword(CPwd);
		Log.info("ConfirmPassword is entered");
		Thread.sleep(1000);
		S.RadioButton();
		Log.info("Radiobutton is clicked");
		Thread.sleep(18000);
		S.SignupBtn();
		Log.info("Signup button is clicked");
	}

}
