package excelHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetExcelAsPerValue {
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream myFile=new FileInputStream("D:\\SOFTWARE TESTING\\Automation\\Selenium\\ExcellSheet\\plant materials.xlsx");
	
	 Workbook mybook = WorkbookFactory.create(myFile);

	 Sheet mySheet = mybook.getSheet("sheet1");

	int  lastNumOfRow=mySheet.getLastRowNum();
	int totalNumOfRow=lastNumOfRow;
			System.out.println(totalNumOfRow);
	int lastNumOfCell = mySheet.getRow(0).getLastCellNum();

	int totalNumOfCell=lastNumOfCell-1;
	System.out.println(totalNumOfCell);
	for(int i=0;i<=totalNumOfRow;i++)
	{
		for(int j=0;j<=totalNumOfCell;j++)
		{
			
			CellType getCellType = mySheet.getRow(i).getCell(j).getCellType();
		
			System.out.print(getCellType+" ");
		
		if(getCellType==CellType.BOOLEAN)
		{
			boolean myBoolean = mySheet.getRow(i).getCell(j).getBooleanCellValue();
		System.out.print(myBoolean+" ");
		}
		else if(getCellType==CellType.STRING)
		{
			String myString=mySheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(myString+" ");
		}
		else if(getCellType==CellType.NUMERIC)
			
		{
			 int myNumeric = (int) mySheet.getRow(i).getCell(j).getNumericCellValue();
		
			System.out.print(myNumeric+" ");
		
		}
			
		}System.out.println();
	}


}



}
