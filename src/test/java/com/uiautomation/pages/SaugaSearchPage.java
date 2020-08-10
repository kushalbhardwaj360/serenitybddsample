package com.uiautomation.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.mississauga.ca/portal/home")
public class SaugaSearchPage extends PageObject {
	@FindBy(id= "text-1")
	private WebElement searchInputField;
	@FindBy(id="01c1")
	private WebElement user1;
	@FindBy(id="01c2")
	private WebElement pass1;

	public void searchFor(String searchRequest) {
		element(searchInputField).click();
		element(searchInputField).type(searchRequest);
		$("//INPUT[@type='submit']").click();
	}

	public void login()
	{
		$("//A[@href='/portal/profile?returnURL=/portal/services/search/&cancelledURL=/portal/services/search/'][text()='login']/self::A").click();
	}

	public void loginCredentials(String username, String password)
	{
		element(user1).type(username);
		element(pass1).type(password);
		$("//INPUT[@src='/ecity/images/btn_go_.png']").click();
	}

	public void validateError()
	{
		String errorMessage = $("//div[@class='alert']").getTextValue();
		System.out.println(errorMessage);
	}
}
