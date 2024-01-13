package NewSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshotusage {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window();
		driver.get("https://www.linkedin.com/feed/");
		File sour= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String rs=RandomString.make(2);
		System.out.println(rs);
		
		File des=new File("D:\\SOFTWARE TESTING\\Automation\\Selenium\\ScreenShot\\ScreenShot\\"+rs+"MySS.png");
		
		FileHandler.copy(sour, des);
		
	}

}
