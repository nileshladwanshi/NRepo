package popupHAndle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabPopupHandle {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("blankets");
		Thread.sleep(1000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(2000);
	String s = driver.findElement(By.xpath("(//div[contains(@class,'a-section')])[59]")).getText();
	System.out.println(s); 
    Thread.sleep(2000);
//    driver.findElement(By.xpath("(//div[@class='a-box-inner'])[1]")).click();
//    Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();}
//

    driver.findElement(By.xpath("//*[contains(text(),'New Born Baby Blankets All Seaso')]")).click();
    Set<String> multiIDS=driver.getWindowHandles();
    
    Iterator<String> allIds=multiIDS.iterator();
    
    
    String mainpageId=allIds.next();
    String child1Id=allIds.next();
    
    
    driver.switchTo().window(child1Id);
    
    
    driver.findElement(By.id("add-to-cart-button")).click();
    
    
    driver.switchTo().window(mainpageId);
    
    driver.findElement(By.id("nav-logo-sprites")).click();
    
    
    
    
    
    
    
	}}


