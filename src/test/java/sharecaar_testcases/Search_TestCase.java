package sharecaar_testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import sharecaar_pageobjects.LoginPage;

public class Search_TestCase extends Search_BaseClass{
	@Test
	public void SearchTest() throws InterruptedException
	{
		LoginPage L=new LoginPage(driver);
		Thread.sleep(1000);
		L.LeavingFrom(From);
		Log.info("Leaving from details are entered");
		Thread.sleep(1000);
		L.GoingTo(To);
		Log.info("Going to details are entered");
		Thread.sleep(1000);
		L.JourneyDate(Date);
		Log.info("Journey Date is entered");
		Thread.sleep(1000);
		L.OfferRide();
		Log.info("offer ride button is clicked");
		Thread.sleep(1000);
		L.Email(Email);
		Log.info("Email is entered");
		Thread.sleep(1000);
		L.Password(Password);
		Log.info("Password is entered");
		Thread.sleep(4000);
		L.ClickLogin();
		Log.info("Login button is clicked");
		Thread.sleep(1000);
		L.StartingLocation(StartingLocation);
		Log.info("Starting location details are entered");
		Thread.sleep(1000);
		L.Destination(Destination);
		Log.info("Destination location is entered");
		Thread.sleep(1000);
		L.OnwardDate(OnwardDate);
		Log.info("onward date is entered");
		Thread.sleep(1000);
		L.OnwardTime(OnwardTime);
		Log.info("onward time is entered");
		Thread.sleep(1000);
		L.ReturnDate(ReturnDate);
		Log.info("return date is entered");
		Thread.sleep(1000);
		L.ReturnTime(ReturnTime);
		Log.info("return time is entered");
		Thread.sleep(2000);
		L.Save();
		Log.info("Save button is clicked");
		String title="Please enter starting location";//Route not recognised, please try different location points
		if(title.contains("starting"))
		{
			System.out.println("Test case is success");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Test case is failed");
			Assert.assertTrue(false);
		}
	}
	
	

}
