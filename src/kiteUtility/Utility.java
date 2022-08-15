package kiteUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility 
{
	public static String readDataFromExcel(int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
		File Myfile=new File("D:\\apachi poi\\MyExel.xlsx");
		String value = WorkbookFactory.create(Myfile).getSheet("Sheet3").getRow(rowNum).getCell(cellNum).getStringCellValue();
		
		return value;
	}
	
	public static void captureScreenshot(WebDriver driver,String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Dest=new File("C:\\Users\\Pramod\\Videos\\Captures\\screenShot\\Scrrenshot"+TCID+".png");
	
		FileHandler.copy(src, Dest);
		Reporter.log("TakenScreenshot",true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
