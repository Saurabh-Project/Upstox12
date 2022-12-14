package Verifyusername_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstox_page4
{
    //Encapsulation concept use
	
	@FindBy(xpath=("//span[text()='saurabh t.']"))private WebElement username;
	
	//constructor call
	public upstox_page4(WebDriver driver)
    {
		PageFactory.initElements(driver, this);
    }
	//utilize within method 
//	public void loginp0(String ex) 
//	{
//	// String	actualtext=textname.getText();
//	 
//  String actualtext1 =textname.getText();
//	 System.out.println(actualtext1);
//		
//	 String except="Saurabh T.";
//		
//		boolean result=actualtext1.equals(except);
//		
//		if(result==true) 
//		{
//			System.out.println("Name of user right and test case pass");
//		}
//		else 
//		{
//			System.out.println("Name of user notright and test case fail");
//	
	
			public String usertext() 
			{
			String	usr=username.getText();
			return usr;
			}
	
	
}
