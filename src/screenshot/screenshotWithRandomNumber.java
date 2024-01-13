package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshotWithRandomNumber {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/?app=desktop&gl=CZ");
		 Thread.sleep(1000);
		 
		File TempLoctaion = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// creating object of randon string for giving random number to our screenshot
		RandomString s = new RandomString();
	    String rs = s.make(2);
	
        // creating an object of file class and put the parameter to storing of file loction
		
		File Destination = new File("E:\\Screenshot Study\\2ndScreenshot"+rs+".png");
		
		FileHandler.copy(TempLoctaion, Destination);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
