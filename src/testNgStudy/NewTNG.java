package testNgStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTNG {
  @Test
  public void fb() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");
	  Reporter.log("fb launching", true);  
	   }
  @Test
  public void insta() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.instagram.com/");
	  Reporter.log("instagram", true);
}
  @Test
  public void twitter(){
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://twitter.com/i/flow/login");
	  Reporter.log("twitter", true);
  }}
