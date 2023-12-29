package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BasePage.BasePageTest;

public class HomePage extends BasePageTest {

	// Page Object

	@FindBy(xpath="//div[3]//button[1]//i[1]")
	WebElement click_on_addcontact;

	@FindBy(xpath="//span[normalize-space()='Calendar']")
	WebElement calender_link;

	@FindBy(xpath="//span[contains(text(),'Companies')]")
	WebElement company_link;

	
	//Initializing the Page Objects with pageFactory
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}


	//Action
	public CalenderPage click_on_calenderlink() {
		calender_link.click();

		return new CalenderPage();
	}

	
	public void click_on_companylink() {
		company_link.click();
	}


	public ContactsPage click_on_contactlink() {
		click_on_addcontact.click();

			return new ContactsPage();
		}
}
