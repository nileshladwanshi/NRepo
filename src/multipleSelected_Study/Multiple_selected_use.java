package multipleSelected_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_selected_use {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		
		WebElement multiSe = driver.findElement(By.xpath("//select[@id='cars']"));
		Thread.sleep(1000);
		Select s = new Select(multiSe);
		
		System.out.println(s.isMultiple());// use of 
		Thread.sleep(1000);
		
		s.selectByVisibleText("Volvo");
		Thread.sleep(1000);
		
		s.selectByIndex(1);
		Thread.sleep(1000);
		
		s.selectByValue("audi");
		Thread.sleep(1000);
		
		//s.deselectByIndex(1);
		//Thread.sleep(1000);
		
		s.deselectAll();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
