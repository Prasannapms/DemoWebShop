package com.Orange.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BaseClass{
	
	
	
	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;
	
		
	@FindBy(id = "FirstName")
	private WebElement firstNameTextField;
	
	@FindBy(id ="LastName")
	private WebElement lastNameTextField;
	
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	@FindBy(id ="ConfirmPassword")
	private WebElement confirmPasswordTextField;
	
	@FindBy(id = "register-button")
	private WebElement registerButton;

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}
	
	
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}
	
	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}
	
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	
	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}
	
	public WebElement getRegisterButton() {
		return registerButton;
	}
	
	public void registerIntoDemoWebShop(String fn, String ln, String email,String password) throws InterruptedException {
	maleRadioButton.click();
	Thread.sleep(2000);
	firstNameTextField.sendKeys(fn);
	Thread.sleep(2000);
	lastNameTextField.sendKeys(ln);
	Thread.sleep(2000);
	emailTextField.sendKeys(email);
	Thread.sleep(2000);
	passwordTextField.sendKeys(password);
	Thread.sleep(2000);
	confirmPasswordTextField.sendKeys(password);
	Thread.sleep(2000);
	registerButton.click();
	
}
}
