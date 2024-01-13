package setPositionTypes;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeType {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/mnjuser/homepage");

		driver.manage().window().maximize();
		Dimension sizeDefault=driver.manage().window().getSize();
		System.out.println(sizeDefault);		
		
		
		Dimension dim=new Dimension(425, 450);
		
		driver.manage().window().setSize(dim);
		
		
		
		
		
	}

}
