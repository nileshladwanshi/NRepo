package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUse1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bcci.tv/");
		Thread.sleep(1000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
		// creating of object of file class
		
		File dest = new File("E:\\Screenshot Study\\1stScreenshot.png");
		
		FileHandler.copy(source, dest);
		
		
		
		
		
		
		
		
		

	}

}
