package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartAdd {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("blankets");
		Thread.sleep(1000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(2000);
	String s = driver.findElement(By.xpath("(//div[contains(@class,'a-section')])[59]")).getText();
	System.out.println(s);
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@class='a-box-inner'])[1]")).click();
Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();}

}
