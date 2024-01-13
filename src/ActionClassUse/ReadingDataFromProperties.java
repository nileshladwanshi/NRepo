package ActionClassUse;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromProperties {

	public static void main(String[] args) throws IOException 
	{
		
		
		Properties prop=new Properties();

		FileInputStream mfiles=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\nileshSelenium\\NileshSeleniumNew.properties");
		
		prop.load(mfiles);
		
		String value=prop.getProperty("pincode");
		
		System.out.println(value);
		
			}

	
	
	//How to create common method for reading data from Property File
			public static String readDataFromProperties(String age) throws IOException
			{
				Properties prop=new Properties();
				
				
				FileInputStream mfile=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\nileshSelenium\\NileshSeleniumNew.properties");
				
				prop.load(mfile);
				
				String value=prop.getProperty(age);
				return value;
			  }
}
