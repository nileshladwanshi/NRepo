package SetSize_SetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize_SetPositionStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
//		 Thread.sleep(1000);
//		Point defaultPosition = driver.manage().window().getPosition();
//		Thread.sleep(1000);
//		System.out.println(defaultPosition);
//		
//		Point p = new Point(300, 10);
//         driver.manage().window().setPosition(p)	;	
         Thread.sleep(1000);
         
         Dimension defaultSize = driver.manage().window().getSize();
         Thread.sleep(1000);
//         
//	     Dimension d = new Dimension(0, 0)
//	    		 Thread.sleep(1000);
//	     driver.manage().window().setSize(d);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
