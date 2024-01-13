package popupHAndle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsHandle {
public static void main(String[] args)throws InterruptedException {
	ChromeOptions option=new ChromeOptions();
	
	//option.addArguments("incognito");
	option.addArguments("-disable-notifications");
	
	option.addArguments("start-maximized");
	
	
	//option.addArguments("--headless");
	
	WebDriver driver =new ChromeDriver(option);
	
	driver.get("https://www.justdial.com/");
	Thread.sleep(1000);
	System.out.println("Title is "+driver.getTitle());

	
	
	
	
	
	
} 
}
