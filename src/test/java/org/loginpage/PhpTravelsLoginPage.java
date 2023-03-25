package org.loginpage;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhpTravelsLoginPage extends BaseClass{

	public PhpTravelsLoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//span[@class='ladda-label']")
	private WebElement buttonclick;
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getButtonclick() {
		return null;
	}
}
