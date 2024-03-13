package sharecaar_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Login_ReadConfig {
	Properties pro;
	public Login_ReadConfig()
	{
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Login.properties");
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


}
