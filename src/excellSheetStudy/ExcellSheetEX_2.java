package excellSheetStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellSheetEX_2 
{
   public static void main (String[]args) throws EncryptedDocumentException, IOException
   {
	   FileInputStream myFile = new FileInputStream("E:\\29 july excell sheet\\Book1.xlsx");
	   
	   // for know which type of dataType its return
	   
	    Workbook myWorkBook = WorkbookFactory.create(myFile);
	    
	    Sheet mySheet = myWorkBook.getSheet("sheet1");
	  
	    Row myRow = mySheet.getRow(1); 
	 
	    Cell myCell = myRow.getCell(0);
	
	    CellType myCellType = myCell.getCellType();   // used to know the which type of datatype it will be stored in cell
	  
	    System.out.println("data Type "+ myCellType);
	  
	  
	  
	  
	  
	  
	  
	  
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
