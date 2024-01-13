package ActionClassUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollOfElement {
public static void main(String[] args) {
	
WebDriver driver=new ChromeDriver();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	WebElement sliderLocator=driver.findElement(By.xpath("//span[@tabindex='0']"));
	
	Actions act=new Actions(driver);
	
	
	//act.moveToElement(sliderLocator).clickAndHold().moveToLocation(30, 30).release().build().perform();
	act.dragAndDropBy(sliderLocator, 50, 0).perform();
	
	
	
	
}
}
