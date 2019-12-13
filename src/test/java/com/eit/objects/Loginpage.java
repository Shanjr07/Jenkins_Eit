package com.eit.objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eit.resource.base;


public class Loginpage  extends base{
	public Loginpage() {
		PageFactory.initElements(driv,this);
		
	}
	 @FindBy(id="language")
	 private WebElement lang;
	 @FindBy(id="cId")
	 private WebElement CoopId;
	 @FindBy(id="uName")
	 private WebElement Username;
	 @FindBy(id="pass")
	 private WebElement password;
	 @FindBy(xpath="//button[text()='Login']")
	 private WebElement login;
	 @FindBy(id="loginbtn")
	 private WebElement Aralogin;
	 public WebElement getAralogin() {
		return Aralogin;
	}
	public WebElement getErrormessclose() {
		return errormessclose;
	}
	@FindBy(xpath="//label[@for='rememberId']")
	 private WebElement Rememberme;
	 @FindBy(xpath="//span[@class='forget-password ng-binding']")
	 private WebElement forget;
	 @FindBy(id="emailId")
	 private WebElement Email;
	 @FindBy(xpath="//button[@ng-click='forgotPassword();']")
	 private WebElement Submit;
	 @FindBy(xpath="//table/tbody/tr/td[@class='jqx-notification-content ']/div")
	 private WebElement errormess;
	 @FindBy(xpath="//table/tbody/tr/td[@class='jqx-notification-close-button-container']")
	 private WebElement errormessclose;
	public WebElement getErrormess() {
		return errormess;
	}
	public WebElement getLang() {
		return lang;
	}
	public WebElement getCoopId() {
		return CoopId;
	}
	public WebElement getUsername() {
		return Username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getRememberme() {
		return Rememberme;
	}
	public WebElement getForget() {
		return forget;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	 
	 
	 
}