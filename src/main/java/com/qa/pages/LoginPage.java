package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BasePage.BasePageTest;

public class LoginPage extends BasePageTest {

	// Page Object Declare

	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement login_btn;

	@FindBy(xpath = "//a[normalize-space()='Sign Up']")
	WebElement signup_link;

	@FindBy(xpath = "//a[normalize-space()='Forgot your password?']")
	WebElement forget_link;




	// Initializing the Page Objects with pageFactory initElement(initialize element) with driver which is declare in base class and object reference variable as "This" as current class object:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:

	public  SignUpPage clickSignUpLink() {
		signup_link.click();
		return new SignUpPage();
	}

	public ForgetPasswordPage clickForgetPasswordLink() {
		forget_link.click();
		return new ForgetPasswordPage();
	}
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login_btn.click();
		
		
		
		                        // Add a return statement here
		return new HomePage(); // Change 'HomePage' to the actual return type
	}
}	











