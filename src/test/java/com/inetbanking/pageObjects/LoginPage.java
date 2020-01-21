package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{ 
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
   @FindBy (name="closeBtn")
   @CacheLookup
   WebElement closeBtn;
	 
   @FindBy (name="uid")
   @CacheLookup
   WebElement txtUserName;
   
   @FindBy (name="password")
   @CacheLookup
   WebElement txtpassword;
   
   @FindBy (name="btnLogin")
   @CacheLookup
   WebElement btnLogin;
   
   
   @FindBy (xpath="//a[contains(text(),'Log out')]")
   @CacheLookup
   WebElement lnkLogout;
   
   
   public void setClose()
   {
	   closeBtn.click();
}
   public void setUserName(String uname)
   {
	   txtUserName.sendKeys(uname);
}
   public void setPassword(String pwd)
   {
	   txtpassword.sendKeys(pwd);
}
   
   public void clickSubmit()
   {
	   btnLogin.click();
}
   public void clickLogout()
	{
		lnkLogout.click();
	}
	
}
