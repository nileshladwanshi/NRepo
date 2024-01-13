package popus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Meesho_newWindowStudy {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=678711876615&hvpos=&hvnetw=g&hvrand=475609254503864175&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-10573980&hydadcr=14453_2371562&gclid=CjwKCAiAx_GqBhBQEiwAlDNAZoO_pFksVF1xjM1rt78r7vlzwqPoFAkjzFjQNNUMroEf3xY7aAJ5rRoCj9AQAvD_BwE");
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dress");
		Thread.sleep(1000);
		List<WebElement> SearchResult = driver.findElements(By.xpath("//div[@class='two-pane-results-container']"));
		Thread.sleep(1000);
		for(WebElement a:SearchResult) 
		{
			System.out.println(a.getText());
		}
		
		System.out.println("=============================");
		String expectedResult = "dresses for women";
		
		for(WebElement s:SearchResult)
		{
			String actualresult = s.getText();
			if( actualresult.equals(expectedResult))
			{
				s.click();
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
