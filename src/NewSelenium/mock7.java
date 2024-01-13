package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mock7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/home");
		driver.navigate().to("https://www.hotstar.com/in/explore");
		driver.findElement(By.xpath("//*[@id=\"searchBar\"]")).sendKeys("doremon");
		
		
	}

}
