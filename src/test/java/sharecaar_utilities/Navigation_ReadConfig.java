package sharecaar_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Navigation_ReadConfig {
	Properties pro;
	public Navigation_ReadConfig()
	{
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Navigation.properties");
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

}
