package webtable_study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricket_score_board_study {

	public static void main(String[] args)
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://www.google.com/search?q=cricket+score+board&rlz=1C1CHBD_enIN1051IN1052&oq=&gs_lcrp=EgZjaHJvbWUqCQgBEEUYOxjCAzIJCAAQRRg7GMIDMgkIARBFGDsYwgMyCQgCEEUYOxjCAzIJCAMQRRg7GMIDMgkIBBBFGDsYwgMyCQgFEEUYOxjCAzIJCAYQRRg7GMIDMgkIBxBFGDsYwgPSAQkxNjIwajBqMTWoAgiwAgE&sourceid=chrome&ie=UTF-8#sie=m;/g/11krj342s1;5;/m/021q23;cms;fp;1;;;");
		 int numOfColumns = driver.findElements(By.xpath("(//table[@class='imspo_tps__tb'])[3]//tr/th")).size();
		
		int numOfRows = driver.findElements(By.xpath("(//table[@class='imspo_tps__tb'])[3]//tr/td")).size();
		
		//reading of header
		System.out.println("----------------------------------------------------------------------------");
		for(int h=1;h<=numOfColumns;h++)
		{
			 WebElement column = driver.findElement(By.xpath("(//table[@class='imspo_tps__tb'])[3]/thead/tr["+1+"]/th["+h+"]"));
			System.out.print(column.getText()+" ");
		}		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		
		// second for loop for getting of rows
		
		for(int r=1;r<=numOfRows-1;r++){
			 
		  for(int s=1;s<=numOfColumns;s++ )	 
		      {
			      WebElement Rows = driver.findElement(By.xpath("(//table[@class='imspo_tps__tb'])[3]/tbody/tr["+r+"]/td["+s+"]"));
		          System.out.print(Rows.getText()+" ");
		      }
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
