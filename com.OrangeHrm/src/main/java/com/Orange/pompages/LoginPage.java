package com.Orange.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy (id = "Password")
	private WebElement passwordTextField;
	
	@FindBy (xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//business operation
	public void loginIntoDemoWebShop(String username, String password) throws InterruptedException
	{
		emailTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		Thread.sleep(5000);
	}
	                                                   
	public void invalidloginIntoDemoWebShop(String username, String password)
	{
		emailTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		emailTextField.clear();
	}
	

}
