package pomtCUsage;

import java.util.List;

//import org.bouncycastle.util.test.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthPlanResult {

	//public static void main(String[] args) {
		

	@FindBy(xpath ="//div[contains(text(),'matching Health')]") private WebElement resultDisplay;
	@FindBy(id = "plan-list")private List<WebElement> planList;
	public HealthPlanResult(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public int textResult()
	{
		String resultOfList=resultDisplay.getText();
		
		String ar[]=resultOfList.split(" ");
		
		String numberOfResultOfString=ar[0];
		
		int numOfResultInInt=Integer.parseInt(numberOfResultOfString);
		
		return numOfResultInInt;
 
}
	public int bannerResult()
	{
			 
	 int totalnumOfList = planList.size();
	return totalnumOfList;
}

		
	}
