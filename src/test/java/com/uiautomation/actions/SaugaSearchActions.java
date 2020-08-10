package com.uiautomation.actions;

import java.util.ArrayList;
import java.util.List;

import com.uiautomation.pages.SaugaSearchPage;

import junit.framework.Assert;
import net.thucydides.core.annotations.Step;

public class SaugaSearchActions {
	SaugaSearchPage searchPage;

	@Step
	public void openSearchPage()
	{
		searchPage.open();
	}

	@Step
	public void performSearch(String searchRequest)
	{
		searchPage.searchFor(searchRequest);
	}

	@Step
	public void login()
	{
		searchPage.login();
	}

	@Step
	public void loginAccount(String user, String password)
	{
		searchPage.loginCredentials(user, password);
	}

	@Step
	public void checkError()
	{
		searchPage.validateError();
	}
}
