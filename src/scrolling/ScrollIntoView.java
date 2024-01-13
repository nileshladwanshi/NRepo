package scrolling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScrollIntoView {

	public static void main(String[] args)throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		WebElement discoverJob=driver.findElement(By.className("heading"));
		Thread.sleep(1000);
		
		 JavascriptExecutor javaExc = (JavascriptExecutor)driver;
		javaExc.executeScript("arguments[0].scrollIntoView();",discoverJob);
		
		//javaExc.executeScript("argument[0].scrollIntoview()",discoverJob);
		
		
		
		File src=discoverJob.getScreenshotAs(OutputType.FILE); 	
		String random = RandomString.make(2);
		File des = new File("D:\\SOFTWARE TESTING\\Automation\\Selenium\\ScreenShot\\ScreenShot\\ss"+random+"WithScrolling.jpg");
		FileHandler.copy(src , des);
		
		
		

	}

}
