package com.OrangeHrm.TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Orange.genericLib.BaseTest;
import com.Orange.genericLib.Reusability;
import com.Orange.pompages.HomePage;
import com.Orange.pompages.RegisterPage;

public class SignUpTest extends BaseTest{
	
	@Test(description = "verify the user is able to register or not" , groups="IT")
	public void signUp() throws IOException, InterruptedException
	{
		//fetching all the data from excel file
		Reusability r = new Reusability();
		String fn = r.getDataFromExcelSheet(EXCEL_PATH, SHEET_NAME,1, 0);
		String ln = r.getDataFromExcelSheet(EXCEL_PATH, SHEET_NAME,1, 1);
		String email = r.getDataFromExcelSheet(EXCEL_PATH, SHEET_NAME, 1, 2);
		String password = r.getDataFromExcelSheet(EXCEL_PATH, SHEET_NAME, 1, 3);
		
		//click on register link
		HomePage hp = new HomePage(driver);
		hp.getRegisterLink().click();
		
		//register into the application
		RegisterPage rp= new RegisterPage(driver);
		rp.registerIntoDemoWebShop(fn, ln, email, password);
		
		
		
		
	}

}
