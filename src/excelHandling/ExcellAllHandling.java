package excelHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellAllHandling {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream myfile=new FileInputStream("D:\\sem 3\\project\\project\\plant material.xlsx");
	
	 Sheet mybook = WorkbookFactory.create(myfile).getSheet("sheet1");
	
	 int lastNumOfrow=mybook.getLastRowNum();
	int totalNumOfRow=lastNumOfrow;
	 
	 
	int lastNumOfCell=mybook.getRow(0).getLastCellNum();
	
	int totalNumOfCell = lastNumOfCell-1;
	
	for(int i=0;i<=totalNumOfRow;i++)
	{
		for(int j=0;j<=totalNumOfCell;j++)
		{
			String value= mybook.getRow(i).getCell(j).getStringCellValue();
		System.out.print(value+" ");
		
		}System.out.println();
	}
	
	
}}
