package ActionClassUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActionUse {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://testautomationpractice.blogspot.com/");
 	
	WebElement srsElement= driver.findElement(By.id("draggable"));
	WebElement destElement=driver.findElement(By.id("droppable"));
	
	Actions act=new Actions(driver);
	
	
	//act.moveToElement(srsElement).clickAndHold().moveToElement(destElement).release().build().perform();
	
	//act.clickAndHold(srsElement).release(destElement).build().perform();
	
	act.dragAndDrop(srsElement, destElement).perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
