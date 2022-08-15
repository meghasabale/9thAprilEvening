package exelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExeiReadingAllTypeDataDynamic 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File Myfile=new File("D:\\apachi poi\\MyExel.xlsx");
		Workbook myworkbook = WorkbookFactory.create(Myfile);
		Sheet mySheet = myworkbook.getSheet("Sheet2");
		int totalrows = mySheet.getLastRowNum();
	    int totalcells = mySheet.getRow(0).getLastCellNum()-1;
	    
	    System.out.println("Total no of rows:"+totalrows);
	    System.out.println("Total no of columns:"+totalcells);
	    
	    for(int i=0;i<=totalrows;i++)
	    {
	    	for(int j=0;j<=totalcells;j++)
	    	{
	    		
	    		 Cell mycell = mySheet.getRow(i).getCell(j);
	    		 CellType celltype = mycell.getCellType();
	    		 
	    		if(celltype==CellType.STRING)
	    		{
	    			String value = mycell.getStringCellValue();
	    			System.out.print(value+" | ");
	    		}
	    		else if(celltype==CellType.NUMERIC)
	    		{
	    			double value = mycell.getNumericCellValue();
	    			System.out.print(value+" | ");
	    		}
	    		else if(celltype==CellType.BOOLEAN)
	    		{
	    			 boolean value = mycell.getBooleanCellValue();
	    			 System.out.print(value+" | ");
	    		}
	    		else if(celltype==CellType.BLANK)
	    		{
	    			System.out.print(" ");
	    		}
	    		
	    		
	    		}
	    	System.out.println();
	    	}
	    	
	}

}
