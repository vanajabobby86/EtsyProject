package org.loginpage;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage extends BaseClass{
	public FacebookLoginPage() {
	PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
    private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginbutton; 
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public void clickloginbutton() {
		// TODO Auto-generated method stub
		
	}
	}


	
	



