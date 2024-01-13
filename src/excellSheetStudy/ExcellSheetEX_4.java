package excellSheetStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellSheetEX_4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myFile = new FileInputStream("E:\\29 july excell sheet\\Book1.xlsx");
		   
		  
	    Workbook myWorkBook = WorkbookFactory.create(myFile);
	    
	    Sheet mySheet = myWorkBook.getSheet("sheet2");
       // read whole table
	    // outer for loop for row----->row------0----->2
	    for(int i=0;i<=2;i++)
	    {
	    	// inner for loop for cell------->0--------->2
	    	for(int b=0;b<=2;b++)
	    	{
	    		String value = mySheet.getRow(i).getCell(b).getStringCellValue();
	    	System.out.print(value+" ");
	    	
	    	}
	    	System.out.println();
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
