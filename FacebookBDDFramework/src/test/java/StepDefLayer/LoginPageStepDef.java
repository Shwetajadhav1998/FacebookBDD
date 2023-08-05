package StepDefLayer;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef extends BaseClass {
   private LoginPage login;
   
	@Given("user is on login page")
	public void user_is_on_login_page() {
	  initialization(); 
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	     login = new LoginPage();
	     login.EnterUsernamePass("9067816449","shweta@123");
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		login.clickOnLoginButton();
	   
	}

	
}
