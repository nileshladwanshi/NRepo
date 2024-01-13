package excellSheetStudy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellSheetEX_6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
         FileInputStream myfile = new FileInputStream("E:\\29 july excell sheet\\Book1.xlsx");
         
         Workbook workbook = WorkbookFactory.create(myfile);
		
         Sheet mySheet = workbook.getSheet("sheet2");
		
         // 22 to 28 is line ke vajah se in future data add or delete zala tri aapla code chalel
         int lastRowNum = mySheet.getLastRowNum();
		int totalNumOfRow = lastRowNum;
		
		short lastCellNum = mySheet.getRow(0).getLastCellNum();
		// cell gives a return according to excell 
		int totalNumOfCell = lastCellNum-1;
		
		// outer for loop for row
		
		for(int i=0;i<= totalNumOfRow;i++)
		{
			// inner for loop for cell
			for(int k=0;k<=totalNumOfCell;k++)
			{
				String value = mySheet.getRow(i).getCell(k).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
