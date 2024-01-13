package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		Thread.sleep(400);
		
		WebElement mul = driver.findElement(By.name("selenium_commands"));
		
		Select smul= new Select(mul);
		
		System.out.println("dropdown is muliple slectable "+smul.isMultiple());
		
		Thread.sleep(400);
		
		smul.selectByIndex(1);
		Thread.sleep(400);

		smul.selectByVisibleText("Wait Commands");
		Thread.sleep(400);

		smul.deselectByIndex(1);
		Thread.sleep(400);

		smul.deselectByVisibleText("Wait Commands");
		Thread.sleep(400);

		smul.selectByVisibleText("Wait Commands");
		Thread.sleep(400);

		smul.deselectAll();
		Thread.sleep(400);

		driver.quit();
		
	}

}
