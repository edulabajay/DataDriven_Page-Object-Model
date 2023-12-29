package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

///import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

import com.qa.BasePage.BasePageTest;

public class ForgetPasswordPage extends BasePageTest {
	

	@FindBy(xpath = "//a[normalize-space()='Forgot your password?']")
	WebElement forget_link;


	public ForgetPasswordPage() {
		PageFactory.initElements(driver, this);
	}


	public ForgetPasswordPage clickForgetPasswordLink() {
		forget_link.click();
		return new ForgetPasswordPage();
	}


}