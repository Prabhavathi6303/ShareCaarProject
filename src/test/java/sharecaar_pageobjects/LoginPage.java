package sharecaar_pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="from")
	WebElement from;
	@FindBy(id="to")
	WebElement to;
	@FindBy(id="date")
	WebElement date;
	@FindBy(xpath="//div[@class='form-group']/a")
	WebElement offerride;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="sbtLogin")
	WebElement clickLogin;
	@FindBy(id="from_location")
	WebElement starting;
	@FindBy(id="to_location")
	WebElement destination;
	@FindBy(id="onward_date")
	WebElement onwarddate;
	@FindBy(id="onward_time")
	WebElement onwardtime;
	@FindBy(id="return_date")
	WebElement returndate;
	@FindBy(id="return_time")
	WebElement returntime;
	@FindBy(xpath="//div[@class='edit-ico']/a[1]")
	WebElement save;
	public void LeavingFrom(String From)
	{
		from.sendKeys(From);
	}
	public void GoingTo(String To)
	{
		to.sendKeys(To);
	}
	public void JourneyDate(String Date)
	{
		date.sendKeys(Date);
	}
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
	public void StartingLocation(String StartingLocation)
	{
		starting.sendKeys(StartingLocation);
	}
	public void Destination(String Destination)
	{
		destination.sendKeys(Destination);
	}
	public void OnwardDate(String OnwardDate)
	{
		onwarddate.sendKeys(OnwardDate);
	}
	public void OnwardTime(String OnwardTime)
	{
		onwardtime.sendKeys(OnwardTime);
	}
	public void ReturnDate(String ReturnDate)
	{
		returndate.sendKeys(ReturnDate);
	}
	public void ReturnTime(String ReturnTime)
	{
		returntime.sendKeys(ReturnTime);
	}
	public void Save()
	{
		save.click();
	}

	
	
	
	
	
	
	
	
	
	
}
