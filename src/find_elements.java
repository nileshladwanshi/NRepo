import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_elements {

	public static void main(String[] args) throws InterruptedException {

       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.makemytrip.com/");
       Thread.sleep(3000);
       
     driver.findElement(By.xpath("//label[@for='fromCity']")).sendKeys("pune");
     
     driver.findElement(By.xpath("//label[@for='tocity']")).sendKeys("manali"); 
     
    		   
	}

}
