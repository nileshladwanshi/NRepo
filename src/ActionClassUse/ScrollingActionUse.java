package ActionClassUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingActionUse {
public static void main(String[] args)throws InterruptedException {
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	WebElement sunday=driver.findElement(By.id("sunday"));
	
	WebElement monday=driver.findElement(By.id("monday"));
	WebElement tuesday=driver.findElement(By.id("tuesday"));
	
	
	Actions act=new Actions(driver);
	Thread.sleep(1000);
	act.scrollToElement(sunday).perform();
	
	act.click(sunday).perform();
	
	
	act.moveToElement(monday).perform();
	act.click().perform();
	//or act.click(monday);
	act.moveToElement(tuesday).perform();
	act.click().perform();
	
	//or act.click(tuesday);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
