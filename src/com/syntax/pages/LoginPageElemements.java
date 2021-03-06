package com.syntax.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.util.BaseClass;

public class LoginPageElemements {
	//@FindBy() is an interface/tecnique help us to locate the element 
	@FindBy(id="txtUsername")
	public WebElement username;
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(id=("btnLogin"))
	public WebElement loginBTN;
	
	@FindBy(xpath=("//div[@id='divLogo']/img"))
	public WebElement logoSyntax;
	
	public LoginPageElemements(){//once we locate elements we Use PageFactory to initialize all elements on this page
		PageFactory.initElements(BaseClass.driver, this);//avoid driver.findElement
	}
}
