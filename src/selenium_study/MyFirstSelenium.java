package selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSelenium {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		//webDriver Method
		
		driver.manage().window().maximize();//1,2 minimize
		
		Thread.sleep(3000);
		
		driver.get("https://www.instagram.com/");//3
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.facebook.com/");//4
		
		Thread.sleep(3000);
		
		driver.navigate().back();//5
		
		Thread.sleep(3000);
		
		driver.navigate().forward();//6
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();//7
		
		Thread.sleep(3000);
		
		driver.close();//8
		
		Thread.sleep(3000);
		
		driver.quit();//9
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
