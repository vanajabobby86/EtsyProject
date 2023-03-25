package org.loginpage;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrangeLoginPage extends BaseClass{
	public OrangeLoginPage() {
	PageFactory.initElements(driver,this);
}
	@FindBy(name="username")
	private WebElement username;			

    @FindBy(name="password")
    private WebElement password;
    
    @FindBy(xpath="//button[@type='submit']")
    private WebElement clicklogin;


    public WebElement getUsername() {
		return username;
	}
    public WebElement getPassword() {
		return password;
	}
    public WebElement getButtonclick() {
		return clicklogin;
	}
		}

