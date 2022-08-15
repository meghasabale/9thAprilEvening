package exelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelReadingForLoop 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File Myfile=new File("D:\\apachi poi\\MyExel.xlsx");
		Workbook myworkbook = WorkbookFactory.create(Myfile);
		Sheet mySheet = myworkbook.getSheet("Sheet1");
		
		//  reading multiple data from single row
		
		for(int i=0;i<=2;i++)
		{
		String value = mySheet.getRow(0).getCell(i).getStringCellValue();
		System.out.println(value);
		}
		System.out.println("=============");
		//  reading multiple data from single row
		for(int i=0;i<=1;i++)
		{
			String value1 = mySheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value1);
			
		}
		
		

	}

}
