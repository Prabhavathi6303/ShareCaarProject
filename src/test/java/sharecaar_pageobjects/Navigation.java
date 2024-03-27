package sharecaar_pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation {
	public static WebDriver driver;
	public Navigation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='form-group']/a")
	WebElement offerride;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="sbtLogin")
	WebElement clickLogin;
	@FindBy(id="navbarDropdown")
	WebElement navbar;
	@FindBy(xpath="//ul[@class='dropdown-menu show']/li[1]/a")
	WebElement profile;
	@FindBy(xpath="//div[@class='profile-top']")
	WebElement text;
	@FindBy(xpath="//ul[@class='dropdown-menu show']/li[2]/a")
	WebElement mybooking;
	@FindBy(xpath="//ul[@class='dropdown-menu show']/li[3]/a")
	WebElement myrides;
	@FindBy(xpath="//ul[@class='dropdown-menu show']/li[4]/a")
	WebElement financialdashboard;
	@FindBy(xpath="//ul[@class='dropdown-menu show']/li[5]/a")
	WebElement accountsetting;
	@FindBy(xpath="//ul[@class='dropdown-menu show']/li[6]/a")
	WebElement wallet;
	@FindBy(xpath="//ul[@class='dropdown-menu show']/li[7]/a")
	WebElement signout;
	public void OfferRide()
	{
		offerride.click();
	}
	public void Email(String Email)
	{
		email.sendKeys(Email);
	}
	public void Password(String Password)
	{
		password.sendKeys(Password);
	}
	public void ClickLogin()
	{
		clickLogin.click();
	}
	public void NabBarDropdown()
	{
		navbar.click();	
	}
	public void Profile() throws InterruptedException
	{
		profile.click();
		Thread.sleep(5000);
		System.out.println("User profile data:");
		String data=text.getText();
		System.out.println(data);
		
	}
	public void MyBookings() throws InterruptedException
	{
		mybooking.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='nav-item'][2]/a")).click();
		
	}
	public void MyRides() throws InterruptedException
	{
		myrides.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[3]")).click();
	}
	public void FinancialDashboard() throws InterruptedException
	{
		financialdashboard.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[3]")).click();
	}
	public void AccountSetting() throws InterruptedException
	{
		accountsetting.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[2]")).click();
	}
	public void Wallet() throws InterruptedException
	{
		wallet.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs']/li[2]")).click();
	}
	public void Signout()
	{
		signout.click();
	}
	
	

}
