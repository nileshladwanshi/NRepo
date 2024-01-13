package excellSheetStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellSheetEX_3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream myFile = new FileInputStream("E:\\29 july excell sheet\\Book1.xlsx");
		   
		  
		    Workbook myWorkBook = WorkbookFactory.create(myFile);
		    
		    Sheet mySheet = myWorkBook.getSheet("sheet1");
		    
		    for (int i=0;i<=2;i++) {
		    	// how to read whole row
		         // varying to cell thats why we send i to cell
		         String value = mySheet.getRow(0).getCell(i).getStringCellValue();
		         //we need this ans in one line thats why we erase the ln and get space to
		         System.out.print(value+" ");
		    }
		 
		    for (int i=0;i<=5;i++) {
		    	// how to read whole cell
		        double value = mySheet.getRow(i).getCell(6).getNumericCellValue();
		   
		        System.out.print(value+" ");
		    
		    }
		
		
		
		
		
		
		
		
		

	}

}
