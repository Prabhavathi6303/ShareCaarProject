package sharecaar_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Signup_ReadConfig {
	Properties pro;
	public Signup_ReadConfig()
	{
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Signup.properties");
		try
		{
			FileInputStream fis=new FileInputStream(f);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getFName()
	{
		String fname=pro.getProperty("FName");
		return fname;
	}
	public String getLName()
	{
		String lname=pro.getProperty("LName");
		return lname;
	}
	public String getEmail()
	{
		String email=pro.getProperty("Email");
		return email;
	}
	public String getContact()
	{
		String contact=pro.getProperty("Contact");
		return contact;
	}
	public String getPassword()
	{
		String password=pro.getProperty("Password");
		return password;
	}
	public String getCPwd()
	{
		String cpwd=pro.getProperty("CPwd");
		return cpwd;
	}

}
