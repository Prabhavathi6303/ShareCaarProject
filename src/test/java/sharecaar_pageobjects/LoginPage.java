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
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="sbtLogin")
	WebElement clickLogin;
	
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
	

	
	
	
	
	
	
	
	
	
	
}
