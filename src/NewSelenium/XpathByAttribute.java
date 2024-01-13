package NewSelenium;

import org.openqa.selenium.By;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
System.out.println("locator study");


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1222);
		driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
		
		
		
		
	}

}
