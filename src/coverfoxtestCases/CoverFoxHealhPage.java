package coverfoxtestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealhPage {

	
		@FindBy(className =  "next-btn") private WebElement nextButton;
		
		public CoverFoxHealhPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);						
	}

		public void ClickOnNextButton()
		{
			nextButton.click();;						
		}

}
