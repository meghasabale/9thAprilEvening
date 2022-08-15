package exelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DynamicExelReading 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File Myfile=new File("D:\\apachi poi\\MyExel.xlsx");
		Workbook myworkbook = WorkbookFactory.create(Myfile);
		Sheet mySheet = myworkbook.getSheet("Sheet1");
		int totalrows = mySheet.getLastRowNum();
	    int totalcells = mySheet.getRow(0).getLastCellNum()-1;
	    
	    System.out.println("Total no of rows:"+totalrows);
	    System.out.println("Total no of columns:"+totalcells);
	    
	    for(int i=0;i<=totalrows;i++)
	    {
	    	for(int j=0;j<=totalcells;j++)
	    	{
	    		
	    		String value = mySheet.getRow(i).getCell(j).getStringCellValue();
	    		System.out.print(value+" | ");
	    	}
	    	System.out.println();
	    	
	    }

		
	}

}
