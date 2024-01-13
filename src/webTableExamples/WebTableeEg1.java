package webTableExamples;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableeEg1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		//WebElement bookTable=driver.findElement(By.xpath("//table[@name='BookTable']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		List<WebElement> row1 = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		
		int rowSize =row1.size();
		System.out.println("Number of rows is "+rowSize);
		
		List<WebElement> column1=driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		int eleSize = column1.size();
		
		System.out.println("Number of column is "+eleSize);
		
		
		
		
		

	}

}
