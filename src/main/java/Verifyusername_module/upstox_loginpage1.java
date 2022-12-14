package Verifyusername_module;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstox_loginpage1
{
    //Encapsulation concept use
	
	@FindBy(xpath=("//input[@name='userId']"))private WebElement  UN;
	@FindBy(xpath=("//input [@placeholder='Enter your password']"))private WebElement  PW;
	@FindBy(xpath=("//div[text()='Sign into Upstox']")) private WebElement  Signbutton;
	
	//constructor call
	public upstox_loginpage1(WebDriver driver)
    {
		PageFactory.initElements(driver, this);
    }
	//utilize within method 
	public void login1(String username) 
	{
		UN.sendKeys(username);
	}
	public void login2(String password) 
	{
		PW.sendKeys(password);
	}
	public void login3() 
	{
		Signbutton.click();
	}
}
