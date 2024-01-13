package excelHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import java.util.logging.FileHandler;

public class ExceelUsage {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myInput=new FileInputStream("D:\\sem 3\\project\\project\\plant material.xlsx");
		Workbook myWorkbook = WorkbookFactory.create(myInput);
		
		for(int i=0;i<=8;i++)
		{
			for(int j=0;j<=2;j++)
				
			{
				String value=myWorkbook.getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(value+" ");
			}
				System.out.println();
		}
		
		
	}

}
