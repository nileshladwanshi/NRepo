package NewSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class geTUrlUse {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		
		Thread.sleep(1000);
		String url = driver.getCurrentUrl(); 
		
		
		System.out.println("current url is "+url);
		String title = driver.getTitle();
		
		System.out.println("current title is "+title);
		driver.quit();
		
	}

}
