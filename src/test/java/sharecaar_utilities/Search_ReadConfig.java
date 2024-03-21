package sharecaar_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Search_ReadConfig {
	Properties pro;
	public Search_ReadConfig()
	{
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Search.properties");
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
	public String getFrom()
	{
		String from=pro.getProperty("From");
		return from;
	}
	public String getTo()
	{
		String to=pro.getProperty("To");
		return to;
	}
	public String getDate()
	{
		String date=pro.getProperty("Date");
		return date;
	}
	public String getEmail()
	{
		String email=pro.getProperty("Email");
		return email;
	}
	public String getPassword()
	{
		String password=pro.getProperty("Password");
		return password;
	}
	public String getStartingLocation()
	{
		String startinglocation=pro.getProperty("StartingLocation");
		return startinglocation;
	}
	public String getDestination()
	{
		String destination=pro.getProperty("Destination");
		return destination;
	}
	public String getOnwardDate()
	{
		String onwarddate=pro.getProperty("OnwardDate");
		return onwarddate;
	}
	public String getOnwardTime()
	{
		String onwardtime=pro.getProperty("OnwardTime");
		return onwardtime;
	}
	public String getReturnDate()
	{
		String returndate=pro.getProperty("ReturnDate");
		return returndate;
	}
	public String getReturnTime()
	{
		String returntime=pro.getProperty("ReturnTime");
		return returntime;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
