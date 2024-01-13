package NewSelenium;

//import java.awt.GridBagConstraints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	    driver.findElement(By.xpath("//a[text()='Create new account']")).click();	
	    Thread.sleep(1000);
	    WebElement das = driver.findElement(By.id("day"));
		
		Select sd=new Select(das);
		
		System.out.println(sd.isMultiple());
		Thread.sleep(1000);

		sd.selectByIndex(5);
		
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
		Select sm=new Select(month);
		
		System.out.println(sm.isMultiple());
        sm.selectByValue("8");
		Thread.sleep(200);
		sm.isMultiple();
		WebElement ear = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		
		Select se=new Select(ear);
		System.out.println(se.isMultiple());
        se.selectByValue("2011");
		se.isMultiple();
		
		driver.close();
		
		
	}

}
