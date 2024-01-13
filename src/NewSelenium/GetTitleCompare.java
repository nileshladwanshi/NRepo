package NewSelenium;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitleCompare {

	public static void main(String[] args) throws InterruptedException {

		String expectedResult="Finally! जिसका सबको इंतज़ार था वो आ गई - NEW CRETA Ex with New Changes 2023 !! - YouTube";
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=F3bfNIDynng");
		Thread.sleep(3100);
		String actualResult= driver.getTitle();
		
		
		if (expectedResult.equals(actualResult)) {
			System.out.println("Title is matched");
			
		}
		else {
		System.out.println("Title is not matched");	
		}
		
		
		
		
	}

}
