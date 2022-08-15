package exelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEG2 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myExelSheet=new File("D:\\apachi poi\\MyExel.xlsx"); 
		Workbook myworkbook = WorkbookFactory.create(myExelSheet);
		Sheet mySheet = myworkbook.getSheet("Sheet1");
		Row myrow = mySheet.getRow(0);
		Cell myCell = myrow.getCell(0);
		CellType mycellType = myCell.getCellType();
		System.out.println(mycellType);
		System.out.println(mySheet.getRow(0).getCell(0).getStringCellValue());
	}

}
