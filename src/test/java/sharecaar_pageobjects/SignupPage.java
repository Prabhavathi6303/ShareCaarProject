package sharecaar_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	public static WebDriver driver;
	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="firstName")
	WebElement firstname;
	@FindBy(id="lastName")
	WebElement lastname;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="contactNo")
	WebElement contact;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="c_password")
	WebElement confirmpwd;
	@FindBy(xpath="//label[@for='female']")
	WebElement radiobutton;
	@FindBy(xpath="//div[@class='btn-block text-center']/button")
	WebElement signupbtn;
	public void FirstName(String FName)
	{
		firstname.sendKeys(FName);
	}
	public void LastName(String LName)
	{
		lastname.sendKeys(LName);
	}
	public void Email(String Email)
	{
		email.sendKeys(Email);
	}
	public void ContactNumber(String Contact)
	{
		contact.sendKeys(Contact);
	}
	public void Password(String Password)
	{
		password.sendKeys(Password);
	}
	public void ConfirmPassword(String CPwd)
	{
		confirmpwd.sendKeys(CPwd);
	}
	public void RadioButton()
	{
		radiobutton.click();
	}
	public void SignupBtn()
	{
		signupbtn.click();
	}

}
