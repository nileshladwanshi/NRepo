package excellSheetStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellSheetEX_5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile = new FileInputStream("E:\\29 july excell sheet\\Book1.xlsx");
		   
		  
	    Workbook myWorkBook = WorkbookFactory.create(myFile);
	    
	    Sheet mySheet = myWorkBook.getSheet("sheet2");
	    
	    int lastNumberRow = mySheet.getLastRowNum();
	    
	    int totalRowNum=lastNumberRow;
	    
	 // answer according to java
	    
		System.out.println(totalRowNum);
		
		System.out.println("========================");
		
		short lastNumberCell = mySheet.getRow(2).getLastCellNum();
		
		int totalCellNum=lastNumberCell-1;
		
		// answer according to excel yet hote mhnun aapn lastNumberCell-1 as aapn kel aahe
		
		System.out.println(totalCellNum);
		
		
		
		
		
		
	}

}
