package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledUse {

	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       Thread.sleep(1000);
       driver.get("https://auth.discoveryplus.in/login");
       Thread.sleep(1000);
       //driver.findElement(By.id("#signIn")).click();

       driver.findElement(By.id("mobileNumber")).sendKeys("9999999999");
       
       
       Thread.sleep(3000);
       
       boolean result = driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
		
		
		System.out.println("get otp status is "+ result);
		
		
		
		
		


	}

}
