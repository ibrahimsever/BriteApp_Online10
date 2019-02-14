package com.cybertek.step_definitions;

import com.cybertek.pages.HomeLoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDefinitions {


    @Given("user on the login page")
    public void user_on_the_login_page() {
        System.out.println("User is opening the login page");
    }

    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String username, String password) {
        System.out.println("Email: "+ username);
        System.out.println("Password: "+ password);

        HomeLoginPage signInPage = new HomeLoginPage();
        signInPage.login(username, password);
    }

    @Then("inbox page should be displayed")
    public void inbox_page_should_be_displayed() {
        System.out.println("User should see inbox page");
    }

    @Then("title should be {string}")
    public void title_should_be(String title) {
        System.out.println("title :"+title);
        System.out.println("It should take you to title page");
        System.out.println("new changes added");
    }





}
