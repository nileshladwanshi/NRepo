package webTableExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableBodyExample {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-series/5945/indian-premier-league-2023/points-table");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//table[@class='table cb-srs-pnts']/thead/tr/th"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		int numOfrow=driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']//tr")).size();
		int numOfColumn=driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']/thead/tr[1]/th")).size();
		
		
		
		
		for(int i=1;i<=numOfColumn;i++)
		{
			String head=driver.findElement(By.xpath("//table[@class='table cb-srs-pnts']/thead/tr[1]/th["+i+"]")).getText();
			System.out.print(head+" ");
			}
		System.out.println();
		System.out.println("====================================");
		
		for(int j=1;j<=numOfrow;j++)
		{
			String data=driver.findElement(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr[1]/td["+j+"]")).getText();
			
			System.out.println(data+" ");
		}
		
		
		

	}

}
