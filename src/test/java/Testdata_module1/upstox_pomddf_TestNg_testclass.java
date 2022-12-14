package Testdata_module1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library.pom_DDF_tNG_utilityclass;
import Library.pom_DDF_testNG_BaseClass;
import Verifyusername_module.Welcomepage3;
import Verifyusername_module.upstox_loginpage1;
import Verifyusername_module.upstox_loginpage2_;
import Verifyusername_module.upstox_page4;

public class upstox_pomddf_TestNg_testclass  extends pom_DDF_testNG_BaseClass
{ 	upstox_loginpage1 up;
upstox_loginpage2_ up1;
Welcomepage3 w;
upstox_page4 i;
Sheet sh;
int TestCaseID;
 
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException 
	{
		
		 initilizebrowser() ;
		
		
		 up=new upstox_loginpage1 (driver);
		 up1=new upstox_loginpage2_ (driver);
		 w=new Welcomepage3(driver);
		 i=new 	upstox_page4(driver);
		
       }
	
	
	

	@BeforeMethod
	public void loginapp() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		
		//excelsheet//String username=sh.getRow(0).getCell(0).getStringCellValue();
	//modifycode take class=	up.login1(pom_DDF_tNG_utilityclass.Gettext_from_excel(0, 0));//
		
		up.login1(pom_DDF_tNG_utilityclass.getdatafetch_propertiesfile("username"));
		//String password=sh.getRow(0).getCell(1).getStringCellValue();
		up.login2(pom_DDF_tNG_utilityclass.getdatafetch_propertiesfile("password"));
	
		up.login3();
		//page 2
	
		//String pin=sh.getRow(0).getCell(2).getStringCellValue();
		
		up1.loginPin(pom_DDF_tNG_utilityclass.getdatafetch_propertiesfile("pin"));
		//page3
		Thread.sleep(2000);
		w.loginp();
		
//		//page4
//		
//		String actualtext1=sh.getRow(0).getCell(3).getStringCellValue();
//		i.loginp0(actualtext1);
//		
	}
	
	@Test
	public void verifyuser() throws EncryptedDocumentException, IOException 
	{
//		String ex=sh.getRow(0).getCell(3).getStringCellValue();
//		i.loginp0(ex);
		
	TestCaseID=201;//initilization id of screenshot
		String expecttext=pom_DDF_tNG_utilityclass.getdatafetch_propertiesfile("gettext");
		
	String 	actualtext=i.usertext();
	
	//assert use hard assert
	
Assert.assertEquals(actualtext, expecttext,"Failed  beacuse username are different ");
	}
	
	@AfterMethod
	public void logout(ITestResult result) throws IOException //ITestResult
	{
		if(result.getStatus()==result.FAILURE) 
		{
			pom_DDF_tNG_utilityclass.capturescreenshot(driver, TestCaseID);
		}
	}
	
	@AfterClass
	public void closebrowser() 
	{
		//driver.close();
		up=null;
		up1=null;
		w=null;
		i=null;
		sh=null;
		driver=null;
	}

}
