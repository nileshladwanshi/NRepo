package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(100);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 pro");
		Thread.sleep(700);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(600);
	driver.get("https://www.amazon.in/Apple-iPhone-Pro-128GB-Gold/dp/B0BDJBGBF3");
		driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Pro (128 GB) - Gold']")).click();
	//	Thread.sleep(600);

		
		//driver.findElement(By.id("add-to-cart-button")).click();
		
		Thread.sleep(600);

	//	driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-checkout-button\"]")).click();
		Thread.sleep(700);

		driver.findElement(By.name("submit.buy-now")).click();
		
		
		

	}

}
