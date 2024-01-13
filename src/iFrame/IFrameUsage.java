package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameUsage {

	public static void main(String[] args)throws InterruptedException   {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(1000);
		driver.switchTo().frame("singleframe");
		Thread.sleep(1000);
		
		String dd=driver.findElement(By.xpath("//h5[text()='iFrame Demo']")).getText();
		
		System.out.println("text of frame is "+dd);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		
		driver.findElement(By.className("analystic")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(2);
		
		Thread.sleep(1000);
		driver.switchTo().frame(14);
		
		//driver.findElement(By.)
		
		
		
		
		

	}

}
