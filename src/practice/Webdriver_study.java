package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_study {

	public static void main(String[] args) 
	{
   
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://meet.google.com/phj-jnsq-ezn");
	driver.get("https://meet.google.com/phj-jnsq-ezn");
	driver.get("https://meet.google.com/phj-jnsq-ezn");
	driver.get("https://meet.google.com/phj-jnsq-ezn");
	driver.close();
	driver.get("https://meet.google.com/phj-jnsq-ezn");
		driver.quit();
		
		


	}

}
