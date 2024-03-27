package sharecaar_testcases;

import org.testng.annotations.Test;

import sharecaar_pageobjects.Navigation;

public class Navigation_TestCase extends Navigation_BaseClass{
	@Test
	public void NavigationTest() throws InterruptedException
	{
		Navigation nav=new Navigation(driver);
		Thread.sleep(1000);
		nav.OfferRide();
		Log.info("Offer ride button is clicked");
		Thread.sleep(1000);
		nav.Email(Email);
		Log.info("Email is entered");
		Thread.sleep(1000);
		nav.Password(Password);
		Log.info("Password is entered");
		Thread.sleep(5000);
		nav.ClickLogin();
		Log.info("Login button is clicked");
		Thread.sleep(1000);
		nav.NabBarDropdown();
		Log.info("Click on account");
		Thread.sleep(1000);
		nav.Profile();
		Log.info("User is navigated into profile page and get the data");
		Thread.sleep(2000);
		driver.navigate().back();
		Log.info("user is navigated to back page");
		Thread.sleep(2000);
		nav.NabBarDropdown();
		Log.info("Click on account");
		Thread.sleep(4000);
		nav.MyBookings();
		Log.info("User is navigated into My Bookings page");
		Thread.sleep(2000);
		driver.navigate().back();
		Log.info("user is navigated to back page");
		Thread.sleep(2000);
		nav.NabBarDropdown();
		Log.info("Click on account");
		Thread.sleep(4000);
		nav.MyRides();
		Log.info("User is navigated into My Rides page");
		Thread.sleep(2000);
		driver.navigate().back();
		Log.info("user is navigated to back page");
		Thread.sleep(2000);
		nav.NabBarDropdown();
		Log.info("Click on account");
		Thread.sleep(4000);
		nav.FinancialDashboard();
		Log.info("User is navigated into Financial dashboard page");
		Thread.sleep(2000);
		driver.navigate().back();
		Log.info("user is navigated to back page");
		Thread.sleep(2000);
		nav.NabBarDropdown();
		Log.info("Click on account");
		Thread.sleep(4000);
		nav.AccountSetting();
		Log.info("User is navigated into Account setting page");
		Thread.sleep(2000);
		driver.navigate().back();
		Log.info("user is navigated to back page");
		Thread.sleep(2000);
		nav.NabBarDropdown();
		Log.info("Click on account");
		Thread.sleep(4000);
		nav.Wallet();
		Log.info("User is navigated into Wallet page");
		Thread.sleep(2000);
		driver.navigate().back();
		Log.info("user is navigated to back page");
		Thread.sleep(2000);
		nav.NabBarDropdown();
		Log.info("Click on account");
		Thread.sleep(4000);
		nav.Signout();
		Log.info("User is successfully signout");
		
		
	}

}
