package exelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelCellType 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File Myfile=new File("D:\\apachi poi\\MyExel.xlsx");
		Workbook myworkbook = WorkbookFactory.create(Myfile);
		Sheet mySheet = myworkbook.getSheet("Sheet1");
		//Numeric value reading
		
		Cell mycell = mySheet.getRow(1).getCell(1);
		System.out.println(mycell.getCellType());
		double value = mycell.getNumericCellValue();
		System.out.println(value);
		
		//boolean value reading
		
		Cell mycell1 = mySheet.getRow(1).getCell(0);
		System.out.println(mycell1.getCellType());
		boolean value1 = mycell1.getBooleanCellValue();
		System.out.println(value1);
		
		//String value reading
		
		Cell mycell2 = mySheet.getRow(0).getCell(0);
		System.out.println(mycell2.getCellType());
		String value3 = mycell2.getStringCellValue();
		System.out.println(value3);
		

	}

}
