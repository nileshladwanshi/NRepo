package popupHAndle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MulplePopupHandling {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.className("_30XB9F")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Shoe");
		driver.findElement(By.xpath("//*[@title='Search for Products, Brands and More']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@class='_2B099V'])[34]")).click();
		Thread.sleep(1000);
		
	driver.findElement(By.xpath("(//*[@class='_2B099V'])[15]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[@class='_2B099V'])[40]")).click();
		
		                                                            
	Set<String>allIds=driver.getWindowHandles();
	
	ArrayList<String> listOfIds=new ArrayList<String>(allIds);
	
	for(int i=0;i<listOfIds.size();i++)
	{
		driver.switchTo().window(listOfIds.get(i));
		
		System.out.println(i+" "+driver.getTitle());
	}
		
		
		
		
		
		
		
	}

}
