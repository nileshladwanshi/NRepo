package synchroOtime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaiteg {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement submitOtp=driver.findElement(By.xpath("//button[@type='submit']"));
		
		WebDriverWait waiting=new WebDriverWait(driver, Duration.ofMillis(5000));
		
		driver.findElement(By.id("mobileNumber")).sendKeys("8521586277");
		
		waiting.until(ExpectedConditions.elementToBeClickable(submitOtp));
		
		submitOtp.click();
		
		
		
		
		
		
		

	}

}
