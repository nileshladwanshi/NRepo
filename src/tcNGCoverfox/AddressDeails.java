package tcNGCoverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddressDeails
{

	@FindBy(xpath = "(//input[@type='number'])[1]")private WebElement pincodeEnter;
	@FindBy(xpath = "(//input[@type='number'])[2]")private WebElement mobileNumField;
	@FindBy(xpath = "//div[text()='Continue']") private WebElement continueButton;
	
	
	public AddressDeails(WebDriver driver)
	{
		PageFactory.initElements(driver,this );						
	}
	
//	public void enterPincode()
//	{
//		pincodeEnter.sendKeys("423109");						
//	}
//	
//	public void enterMobileNum()
//	{
//		mobileNumField.sendKeys("9130908801");						
//	}
	
	public void enterPincode(String pin)
	{
		Reporter.log("entering pincode", true);
		pincodeEnter.sendKeys(pin);
	}

	public void enterMobileNum(String mobileNum)
	{
		mobileNumField.sendKeys(mobileNum);
	}
	public void clickOnContinue()
	{
		continueButton.click();						
	}
	
	
	
	
	
	
	
	
}
