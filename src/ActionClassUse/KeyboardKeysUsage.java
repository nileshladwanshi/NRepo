package ActionClassUse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardKeysUsage {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement createAccount=driver.findElement(By.linkText("Create new account"));
	
	Actions act =new Actions(driver);
	
	act.click(createAccount).perform();
	Thread.sleep(1000);
	WebElement firstnameElement=driver.findElement(By.name("firstname"));
	
	act.sendKeys(firstnameElement,"Nilesh").perform();
	Thread.sleep(2000);
	WebElement lastNameElement=driver.findElement(By.name("lastname"));
	
	act.sendKeys(lastNameElement,"Ladwanshi").perform();
	
	
	//Date selection
	
	WebElement dayElement=driver.findElement(By.id("day"));
	
	act.click(dayElement).sendKeys(Keys.ARROW_DOWN).build().perform();
	act.sendKeys(Keys.ARROW_DOWN).perform();
	act.sendKeys(Keys.ARROW_UP).perform();
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	
	WebElement year=driver.findElement(By.id("year"));
	
	act.click(year).sendKeys(Keys.ARROW_DOWN).build().perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
}
}
