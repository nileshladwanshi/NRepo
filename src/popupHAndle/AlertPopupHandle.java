package popupHAndle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {
public static void main (String[] args)throws InterruptedException
{
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.name("submit")).click();
Alert aler=	driver.switchTo().alert();
	System.out.println("Popup text is ->"+aler.getText());
Thread.sleep(1000);

	aler.dismiss();
	Thread.sleep(1000);
	//driver.switchTo().defaultContent();
	driver.findElement(By.name("cusid")).sendKeys("exceptios");
	













}



}
