package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class LoginPage extends BaseClass{
	
	@FindBy(name = "email")
    private WebElement username;
	
	@FindBy(name = "pass")
    private WebElement password;

	@FindBy(name = "login")
    private WebElement loginbutton;
	
	public LoginPage() {
		
	PageFactory.initElements(driver, this);	
	}
	
  public void EnterUsernamePass(String uname, String pass)
  {
	  UtilsClass.sendkeys(username,uname);
	  UtilsClass.sendkeys(password,pass);
  }
  public void clickOnLoginButton() {
	  UtilsClass.click(loginbutton);
  }
	
	
}
