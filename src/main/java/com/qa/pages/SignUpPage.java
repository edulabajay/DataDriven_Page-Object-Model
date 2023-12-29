package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

import com.qa.BasePage.BasePageTest;

public class SignUpPage extends BasePageTest {

	// Page Object Declare
	@FindBy(xpath = "//a[normalize-space()='Sign Up']")
	WebElement signup_link;

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}



public SignUpPage SignUpLink() {
signup_link.click();
	
	return new SignUpPage();
	
}














}