package misc;

//import java.awt.Desktop.Action;
import java.io.IOException;

//import ActionClassUse.ActionClassUseClick;
import ActionClassUse.ReadingDataFromProperties;

public class readDataPropertiestesting {

	public static void main(String[] args) throws IOException {

		String value1 = ReadingDataFromProperties.readDataFromProperties("mobnum");
		System.out.println(value1);
		
		String value2 = ReadingDataFromProperties.readDataFromProperties("pincode");
		
		String value3 = ReadingDataFromProperties.readDataFromProperties("age");
		
		System.out.println(value2);
		System.out.println(value3);
		
	
	
	
	}

}
