package Verifyusername_module;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage3
{
    //Encapsulation concept use
	
	@FindBy(xpath=("(//div[@class='_2k4Zlk-e-Xvq7tMQ6fDfoP'])[1]"))private WebElement  welcome;
	
	//constructor call
	public Welcomepage3(WebDriver driver)
    {
		PageFactory.initElements(driver, this);
    }
	//utilize within method 
	public void loginp() 
	{
		welcome.click();
	}
	
}
