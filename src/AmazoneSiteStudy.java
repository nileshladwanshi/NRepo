import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneSiteStudy {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.id("nav_cs_4")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
		
		
		
		
		
		
		
		
	}

}
