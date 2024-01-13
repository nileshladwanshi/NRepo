package NewSelenium;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 String rnd = RandomString.make(2);
		File des=new File("D:\\SOFTWARE TESTING\\Automation\\Selenium\\ScreenShot\\ScreenShot\\mySS"+rnd+".jpg");
		FileHandler.copy(src, des);
		
		
		
		
	}

}
