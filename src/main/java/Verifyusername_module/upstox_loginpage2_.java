package Verifyusername_module;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstox_loginpage2_
{
    //Encapsulation concept use
	
	@FindBy(xpath=("//input[@name='yob']"))private WebElement  PIN;
	
	//constructor call
	public upstox_loginpage2_(WebDriver driver)
    {
		PageFactory.initElements(driver, this);
    }
	//utilize within method 
	public void loginPin(String pin) 
	{
		PIN.sendKeys(pin);
	}
	
}
