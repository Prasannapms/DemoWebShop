package com.OrangeHrm.TestScripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Orange.genericLib.BaseTest;
import com.Orange.genericLib.CustomListener;
import com.Orange.genericLib.Reusability;
import com.Orange.pompages.HomePage;
import com.Orange.pompages.LoginPage;


@Listeners(CustomListener.class)
public class LoginTest extends BaseTest{
	
	@Test(description = "Verify the user is able to login or not", groups= {"ST","RT"})
	public void login() throws InterruptedException, IOException
	{
		Reusability r = new Reusability();
		String username = r.getDataFromExcelSheet(EXCEL_PATH, LOG_SHEET, 1, 0);
		String password = r.getDataFromExcelSheet(EXCEL_PATH, LOG_SHEET, 1, 1);
		// click on Login link
		HomePage hp = new HomePage(driver);
		hp.getloginLink().click();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoDemoWebShop(username,password);
	}

}
