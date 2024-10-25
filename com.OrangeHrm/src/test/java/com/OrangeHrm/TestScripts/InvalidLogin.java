package com.OrangeHrm.TestScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Orange.genericLib.BaseTest;
import com.Orange.pompages.HomePage;
import com.Orange.pompages.LoginPage;

public class InvalidLogin extends BaseTest{
	
	@DataProvider(name = "TestData")
	public Object[][] invalidTestData()
	{
		Object[][] o = new Object[6][2];
		o[0][0] = "prs";
		o[0][1] = "Neela";
		
		o[1][0] = "ajdha";
		o[1][1] = "hdssgs";
		
		o[2][0] = "jhadag";
		o[2][1] = "sdah";
		
		o[3][0] = "ahsjaans";
		o[3][1] = "jashdh";
		
		o[4][0] = "hjsgd";
		o[4][1] = "hasshj";
		
		o[5][0] = "hags";
		o[5][1] = "YQWY";
		return o;
		
	}
	
	@Test(dataProvider = "TestData", groups="FT")
	public void InvalidLoginIntoDemoWebShop(String username, String password)
	{
		//click on login link
		HomePage hp=new HomePage(driver);
		hp.getloginLink().click();
		//invalid login
		LoginPage lp = new LoginPage(driver);
		lp.invalidloginIntoDemoWebShop(username, password);
	}

}
