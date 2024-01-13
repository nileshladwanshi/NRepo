package excelHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelStart {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream newFile=new FileInputStream("D:\\sem 3\\project\\project\\plant material.xlsx");
		
		String value=WorkbookFactory.create(newFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("value in sheet is "+value);
		
		
		
		
		
	}

}
