package excelHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SheetWithLoop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream mystream=new FileInputStream("D:\\\\sem 3\\\\project\\\\project\\\\plant material.xlsx");
		
		Workbook myWorkbook = WorkbookFactory.create(mystream);
		
		 Sheet mySheet = myWorkbook.getSheet("sheet1");
//		  Row myRow = mySheet.getRow(0);
//		Cell myCell = myRow.getCell(0);  
		  
		  for(int i=0;i<=2;i++)
		  {
			 String value=mySheet.getRow(0).getCell(i).getStringCellValue();
			  
			  System.out.print(value+" ");
		  }
		  System.out.println();
		  
		  System.out.println("===========================");
		  
		  for(int j=0;j<=10;j++)
		  {
			  
			String  value2=mySheet.getRow(j).getCell(0).getStringCellValue();
			  System.out.print(value2+" ");
		  }
		  System.out.println();
		  
		  
	}

}
