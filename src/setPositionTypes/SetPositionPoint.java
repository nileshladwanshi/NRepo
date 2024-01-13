package setPositionTypes;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

//import java.awt.Window;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionPoint {

	public static void main(String[] args)throws 
	InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.naukri.com/mnjuser/homepage");
		
	     Point defaultPosition = driver.manage().window().getPosition();
		System.out.println(defaultPosition);
		Point p=new Point(124, 68);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p);		
		Thread.sleep(1000);
		
		 Dimension defaultSize = driver.manage().window().getSize();
		
		System.out.println(defaultSize);
		Dimension d=new Dimension(120, 400);
		driver.manage().window().setSize(d);
		
		
		

	}

}
