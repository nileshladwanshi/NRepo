package excelHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHandle {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream myFile=new FileInputStream("D:\\sem 3\\project\\project\\plant material.xlsx");
	
	Workbook MyWorkBook=WorkbookFactory.create(myFile);
	Sheet mySheet = MyWorkBook.getSheet("sheet1");
	Row myRow=mySheet.getRow(0);
	Cell myCell = myRow.getCell(0);
	String value=myCell.getStringCellValue();
	
	System.out.println(value);
	
	
}}
