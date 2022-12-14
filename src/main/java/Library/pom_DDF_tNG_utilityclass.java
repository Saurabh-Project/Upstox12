package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class pom_DDF_tNG_utilityclass 
{
	
  public static String Gettext_from_excel(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
  {
	  FileInputStream file =new FileInputStream("C:\\Users\\HP\\Desktop\\upstoxTestcase.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2"); 
		 
		String value=sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		return value;
  }
  
  public static void capturescreenshot(WebDriver driver,int TestcaseID) throws IOException 
  {
	File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//now that take photo now desire folder
	File dest= new File("F:\\data backup eclips\\selenium_prac\\ScreenShot\\TCD "+TestcaseID+".jpg");

	FileHandler.copy(scr, dest);
	
  }
  //data fetch from properties file
  public static String getdatafetch_propertiesfile(String key) throws IOException 
  {
	  FileInputStream fl=new FileInputStream("F:\\data backup eclips\\selenium_prac\\upstox_Testcasedata.properties");
   Properties p=new Properties();
   p.load(fl);
 String value= p.getProperty(key);
 return value;
  }
  
}
