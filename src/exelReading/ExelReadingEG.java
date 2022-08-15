package exelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelReadingEG 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		File Myfile=new File("D:\\apachi poi\\MyExel.xlsx");
		String value = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

		String value1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String value2 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();

		System.out.println(value);
		System.out.println(value1);
		System.out.println(value2);
		
	}

}
