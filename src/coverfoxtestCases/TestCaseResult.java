package coverfoxtestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCaseResult {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		ChromeOptions op=new ChromeOptions();
				op.addArguments("--disable-notifications");
				
		
				FileInputStream m= new FileInputStream("D:\\SOFTWARE TESTING\\Automation\\Selenium\\ExcellSheet\\1557E160.xlsx"); 
				  Sheet myBook = WorkbookFactory.create(m).getSheet("Sheet2");
				String age=myBook.getRow(0).getCell(0).getStringCellValue();
				String pin=myBook.getRow(0).getCell(1).getStringCellValue();
				String mobile=myBook.getRow(0).getCell(2).getStringCellValue();

				
				
		WebDriver driver =new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		
		coveFoxHome cfh=new coveFoxHome(driver);
		Thread.sleep(500);
		cfh.clickOnMaleButton();
		Thread.sleep(500);
//		
		CoverFoxHealhPage cfhp=new CoverFoxHealhPage(driver);
		cfhp.ClickOnNextButton();
		Thread.sleep(1500);
		
		MemberDeail md=new MemberDeail(driver);
		md.EnterAge(age);
		Thread.sleep(500);
		md.ClickOnNext();
		Thread.sleep(1500);
//		
		AddressDeails ad=new AddressDeails(driver);
		ad.enterPincode(pin);
		Thread.sleep(1500);
		ad.enterMobileNum(mobile);
		Thread.sleep(500);
		ad.clickOnContinue();
//		
		Thread.sleep(5500);
		HealthPlanResult hpr=new HealthPlanResult(driver);
		hpr.validPlanListResult();
		Thread.sleep(10500);
		driver.close();
//		
//		
		
		
		

	}

}
