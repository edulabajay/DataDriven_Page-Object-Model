package com.testpage;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BasePage.BasePageTest;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPage_Test extends BasePageTest{

	
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPage_Test () {
		
		super();
	}
	
	
	@BeforeMethod
	public void SetUp() {
	    try {
	        Initialization();
	        loginpage = new LoginPage();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	
	@Test
	public void LoginPageTestmethod() {
		String title = loginpage.validateLoginPageTitle();

		AssertJUnit.assertEquals(title, "Cogmento CR");
	}

}
