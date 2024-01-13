package dropdownListUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectableDropdown {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);		
		
	WebElement ms = driver.findElement(By.id("cars"));
	   Thread.sleep(1000);	
		Select s = new Select(ms);
		System.out.println(s.isMultiple());
		

	}

}
