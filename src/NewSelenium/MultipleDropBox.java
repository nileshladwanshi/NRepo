package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");

		WebElement db = driver.findElement(By.id("cars"));
		Select se=new Select(db);
		
		System.out.println(se.isMultiple());
		Thread.sleep(100);
		se.selectByVisibleText("Volvo");
		Thread.sleep(100);
		se.selectByIndex(3);
		Thread.sleep(100);
		se.selectByValue("opel");
		 
		Thread.sleep(1000);
		se.deselectByValue("opel");
		se.deselectAll();
		
		
		
	}

}
