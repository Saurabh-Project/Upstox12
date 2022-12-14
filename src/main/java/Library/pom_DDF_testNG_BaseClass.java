package Library;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pom_DDF_testNG_BaseClass 
{
	
    //repeated code take in base class
	public WebDriver driver;
	/* 
	 * Auther name=@saurabh tamboli  
	 * 
	 * In this Baseclass i take mandatatory code for run everytime
	 * 
	 * */
	
	public void initilizebrowser() throws IOException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chromedriver.exe");
		
		driver =new ChromeDriver();
		
		//maximize
				driver.manage().window().maximize();
				//wait
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		//open browser
		//driver.get("https://login-v2.upstox.com/");
				driver.get(pom_DDF_tNG_utilityclass.getdatafetch_propertiesfile("url"));
	}
	
	
}
