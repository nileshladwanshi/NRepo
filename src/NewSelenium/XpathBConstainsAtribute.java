package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBConstainsAtribute {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//Li[contains(@id,'cab')]")).click();
		Thread.sleep(2000);

		driver.close();
		
	}

}
