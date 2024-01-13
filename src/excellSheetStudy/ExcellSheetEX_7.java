package excellSheetStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellSheetEX_7 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
 FileInputStream myfile = new FileInputStream("E:\\29 july excell sheet\\Book1.xlsx");
         
         Workbook workbook = WorkbookFactory.create(myfile);
		
         Sheet mySheet = workbook.getSheet("sheet2");
		
		int lastRowNum = mySheet.getLastRowNum();
		
		int totalNumOfRow =lastRowNum;
		//int totalCellNum = mySheet.getRow(0).getLastCellNum()-1;
		short lastCellNum = mySheet.getRow(0).getLastCellNum();
		
		int totalCellNum = lastCellNum-1;

		for(int i=0;i<= totalNumOfRow;i++)
		{
			// inner for loop for cell
			for(int k=0;k<=totalCellNum;k++)
			{
	              CellType myCellType = mySheet.getRow(i).getCell(k).getCellType();
				System.out.print( myCellType+" ");
				
				
				if(myCellType==CellType.STRING)
				{
					String value = mySheet.getRow(i).getCell(k).getStringCellValue();
					System.out.print(value+" ");
				}
				
				else if(myCellType==CellType.NUMERIC)
				{
					double value = mySheet.getRow(i).getCell(k).getNumericCellValue();
					System.out.print(value+" ");
				}
				
				else if(myCellType==CellType.BOOLEAN)
				{
					boolean value = mySheet.getRow(i).getCell(k).getBooleanCellValue();
					System.out.print(value+" ");
				}
			}
			    System.out.println();	
				
				
				
			
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
	
	}
}
