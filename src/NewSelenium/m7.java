package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class m7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/home");
		Thread.sleep(3100);

		driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[2]/aside/nav/div[2]/a/div/span[1]/i")).click();
		Thread.sleep(700);

		driver.findElement(By.xpath("//*[@id=\"searchBar\"]")).sendKeys("doremon");
	}

}
