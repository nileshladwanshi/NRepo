package coverfoxtestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coveFoxHome 
{
	
	@FindBy( xpath = "//div[text()='Male']")private WebElement maleButton;
	
	
	public coveFoxHome(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);		
	}
	
	public void clickOnMaleButton()
	
	{
		maleButton.click();
	}
	
	
	
	
	
	
	
	
}
