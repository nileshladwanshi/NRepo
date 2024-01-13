package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotStudy2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bcci.tv/");
		Thread.sleep(1000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(1000);
		RandomString rs =new RandomString();
		String w = rs.make(2);                                                                                                                                                  
		File f = new File("E:\\Screenshot Study\\myphoto1.png");
		Thread.sleep(1000);
		FileHandler.copy(src, f);
		 

	}

}
