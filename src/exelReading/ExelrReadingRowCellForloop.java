package exelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelrReadingRowCellForloop
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File Myfile=new File("D:\\apachi poi\\MyExel.xlsx");
		Workbook myworkbook = WorkbookFactory.create(Myfile);
		Sheet mySheet = myworkbook.getSheet("Sheet1");
		
		for(int i=0;i<=1;i++)  //outer for loop for row
		{
			for(int j=0;j<=2;j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" | ");
				
			}
			System.out.println();
		}
	}

}
