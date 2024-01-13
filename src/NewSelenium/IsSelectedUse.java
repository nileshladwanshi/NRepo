package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelectedUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/?stype=lo&deoia=1&jlou=AfdMELWkgyCqAp7RToUwSfvEHYhj5Ot6iedgzSnhh0dutcAXzyWiv6ejTsrP68g5gXm7BgRx118iAgFcIHj91IcWWBSHls2jpOkmbaF33Nm_9A&smuh=31121&lh=Ac_0bnoE8h21IBlLB2Y");
		Thread.sleep(3800);

		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();	
		Thread.sleep(1800);

	    // driver.findElement(By.xpath("//input[@value='2']"));
		
		WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
		Thread.sleep(1800);

		boolean result = male.isSelected();
		Thread.sleep(1800);

		System.out.println("result of button is "+result);
		

	}
	
	
}
