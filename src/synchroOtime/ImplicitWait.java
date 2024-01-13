package synchroOtime;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args)throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.youtube.com/watch?v=30lsdxjbuXg");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		
		
		
		
		
		

	}

}
