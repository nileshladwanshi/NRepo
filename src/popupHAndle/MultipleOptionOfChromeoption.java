package popupHAndle;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleOptionOfChromeoption {
public static void main(String[] args)throws InterruptedException {
	ChromeOptions opt= new ChromeOptions();
	
	ArrayList<String> listOpt=new ArrayList<String>();
	
	//listOpt.add("incognito");
	listOpt.add("-disable-notifications");
	listOpt.add("start-maximized");

	opt.addArguments(listOpt);
	
	
	WebDriver driver=new ChromeDriver(opt);
	
	
	driver.get("https://www.justdial.com/");
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
	
	
	
	
	
	
}
}
