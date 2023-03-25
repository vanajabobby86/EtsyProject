package org.loginpage;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FacebookRegisterPage extends BaseClass{
	
	public FacebookRegisterPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@rel='async']")
	private WebElement createbtn;
		
	@FindBy(name="firstname")
	private WebElement firstname;
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement phonenumber;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement newpassword;
	
	@FindBy(name="birthday_day")
	private WebElement day;
	
	@FindBy(name="birthday_month")
	private WebElement month;
	
	@FindBy(name="birthday_year")
    private WebElement year;
	
	@FindBy(name="websubmit")
	private WebElement clicksignup;
	
	@FindBy(xpath="//input[@type='radio'])[1]")
	private WebElement female;
	
	@FindBy(xpath="//input[@type='radio'])[2]")
	private WebElement male;
	
	@FindBy(xpath="//input[@type='radio'])[3]")
	private WebElement custom;
	
	public WebElement getfirstname() {
		return firstname;
		}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getPhonenumber() {
		return phonenumber;
	}
	public WebElement getNewpassword() {
		return newpassword;
	}	
	public WebElement getClicksignup() {
		return clicksignup;
	}
	public WebElement getCreatebtn() {
		return createbtn;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	}
	
	

	
	
	


