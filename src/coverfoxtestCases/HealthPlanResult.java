package coverfoxtestCases;

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
	public void validPlanListResult()
	{
		String resultOfList=resultDisplay.getText();
		
		String ar[]=resultOfList.split(" ");
		
		String numberOfResultOfString=ar[0];
		
		int numOfResultInInt=Integer.parseInt(numberOfResultOfString);
		
		 int totalnumOfList = planList.size();
		 
		 if(totalnumOfList==numOfResultInInt)
		 {
			 System.out.println("Test case is pass");
		 }
		 else {
			 System.out.println("Test case is fail");
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
