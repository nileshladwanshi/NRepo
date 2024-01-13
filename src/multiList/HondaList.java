package multiList;

import java.util.List;

//import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HondaList {

	public static void main(String[] args)throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Tata");
		Thread.sleep(1000);
		List<WebElement> resultListop=driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]"));
		Thread.sleep(1000);
		System.out.println("====for each loop");
		for(WebElement s:resultListop)
		{
			System.out.println(s.getText());
		}
		//System.out.println(resultList);

	}

}
