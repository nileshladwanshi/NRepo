package NewSelenium;

import java.io.File;
import java.io.IOException;
//import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenSho {

	public static void main(String[] args) throws InterruptedException, IOException{

		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Tata");
		Thread.sleep(1000);

		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\SOFTWARE TESTING\\Automation\\Selenium\\ScreenShot\\ScreenShot\\ss.jpg");

		org.openqa.selenium.io.FileHandler.copy(source, des);
		
	}

}
