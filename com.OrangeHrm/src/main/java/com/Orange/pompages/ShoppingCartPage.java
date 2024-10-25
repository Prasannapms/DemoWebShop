package com.Orange.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BaseClass {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "termsofservice")
	private WebElement termsOfServicesCheckBox;
	
	@FindBy(id = "checkout")
	private WebElement checkOutButton;
	
	public WebElement getTermsOfServicesCheckBox() {
		return termsOfServicesCheckBox;
	}
	
	public WebElement getCheckOutButton() {
		return checkOutButton;
	}

}
