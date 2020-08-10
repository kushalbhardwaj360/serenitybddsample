package com.uiautomation.steps;

import com.uiautomation.actions.SaugaSearchActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SaugaSearchStep {
	@Steps
	SaugaSearchActions saugaSearchActions;

	@Given("^I want to search Mississauga$")
	public void i_want_to_search_Mississauga() throws Throwable {
		saugaSearchActions.openSearchPage();
	}

	@When("^I want to search for '(.*)'")
	public void i_want_to_search_for_I_love_Mississaga(String searchRequest) throws Throwable {
		saugaSearchActions.performSearch(searchRequest);

	}

	@Then("^I click on login$")
	public void i_click_on_login() throws Throwable{
		saugaSearchActions.login();
	}

	@Then("^I enter Credentials '(.*)' and '(.*)'")
	public void i_enter_Credentials_Hima_Naresh(String user, String password) throws Throwable{
		saugaSearchActions.loginAccount(user,password);
	}

	@Then("^I get error message$")
	public void i_get_error_message() throws Exception {
    saugaSearchActions.checkError();
}


}
