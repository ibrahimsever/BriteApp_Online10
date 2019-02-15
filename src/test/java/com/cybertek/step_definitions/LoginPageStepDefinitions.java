package com.cybertek.step_definitions;

import com.cybertek.pages.HomeLoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.Pages;
import com.github.javafaker.Faker;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPageStepDefinitions {


    Faker faker=new Faker();


    @Given("the user goes to url")
    public void the_user_goes_to_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("the user clicks on BriteErpDemo button")
    public void the_user_clicks_on_BriteErpDemo_button() {
        HomeLoginPage homeLoginPage=new HomeLoginPage();
        homeLoginPage.demoButton.click();
        homeLoginPage=null;

    }

    @Then("the title should be Login  Website localhost")
    public void the_title_should_be_Login_Website_localhost() {
        Assert.assertEquals("Login | Website localhost", Driver.getDriver().getTitle());
    }

    @Then("the database should be BriteErpDemo")
    public void the_database_should_be_BriteErpDemo() {
        HomeLoginPage homeLoginPage=new HomeLoginPage();
        String getDBAttribute=homeLoginPage.selectedDatabase.getAttribute("value");
        Assert.assertEquals("BriteErpDemo",getDBAttribute);
        homeLoginPage=null;

    }

    @When("the manager enters valid email address")
    public void the_manager_enters_valid_email_address() {
        HomeLoginPage homeLoginPage=new HomeLoginPage();
        homeLoginPage.username.sendKeys(ConfigurationReader.getProperty("manager_email"));
        homeLoginPage=null;
    }

    @When("the manager enters valid password")
    public void the_manager_enters_valid_password() {
        HomeLoginPage homeLoginPage=new HomeLoginPage();
        homeLoginPage.password.sendKeys(ConfigurationReader.getProperty("mamager_password"));
        homeLoginPage=null;
    }

    @When("clicks Log in button")
    public void the_manager_clicks_Log_in_button() {
        HomeLoginPage homeLoginPage=new HomeLoginPage();
        homeLoginPage.loginButton.click();
        homeLoginPage=null;
    }

    @Then("the title should be Odoo")
    public void the_title_should_be_Odoo() throws InterruptedException {
        System.out.println("title = " + Driver.getDriver().getTitle());
        String urlnext="http://52.39.162.23/web?#menu_id=115&action=120&active_id=channel_inbox";
//        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),7);
//        wait.until(ExpectedConditions.urlToBe(urlnext));
        Thread.sleep(9000);
        Assert.assertEquals("Odoo",
                Driver.getDriver().getTitle());

    }

    @When("the manager enters wrong email address")
    public void the_manager_enters_wrong_email_address() {
        HomeLoginPage homeLoginPage=new HomeLoginPage();
        String fakeEmail=faker.internet().emailAddress();
        System.out.println();
        homeLoginPage.username.sendKeys(fakeEmail);
        faker = null;
        homeLoginPage=null;
    }

    @When("the manager enters wrong password")
    public void the_manager_enters_wrong_password() {
        HomeLoginPage homeLoginPage=new HomeLoginPage();
        homeLoginPage.password.sendKeys(faker.internet().password());
        faker = null;
        homeLoginPage=null;
    }

    @When("the manager doesn't enter an email address")
    public void the_manager_doesn_t_enter_an_email_address() {
        HomeLoginPage homeLoginPage=new HomeLoginPage();
        homeLoginPage.username.sendKeys("");
        homeLoginPage=null;
    }

    @When("the manager doesn't enter a password")
    public void the_manager_doesn_t_enter_a_password() {
        HomeLoginPage homeLoginPage=new HomeLoginPage();
        homeLoginPage.password.sendKeys("");
        homeLoginPage=null;
    }

    @When("the user enters valid email address")
    public void the_user_enters_valid_email_address() {
        HomeLoginPage homeLoginPage=new HomeLoginPage();
        homeLoginPage.username.sendKeys(ConfigurationReader.getProperty("user_email"));
        homeLoginPage=null;
    }

    @When("the user enters valid password")
    public void the_user_enters_valid_password() {
        HomeLoginPage homeLoginPage=new HomeLoginPage();
        homeLoginPage.password.sendKeys(ConfigurationReader.getProperty("user_password"));
        homeLoginPage=null;
    }

//    @When("the user clicks Log in button")
//    public void the_user_clicks_Log_in_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }

    @When("the user enters wrong email address")
    public void the_user_enters_wrong_email_address() {
        HomeLoginPage homeLoginPage=new HomeLoginPage();
        homeLoginPage.username.sendKeys(faker.internet().emailAddress());
        homeLoginPage=null;
    }

    @When("the user enters wrong password")
    public void the_user_enters_wrong_password() {
        HomeLoginPage homeLoginPage=new HomeLoginPage();
        homeLoginPage.password.sendKeys(faker.internet().password());
        homeLoginPage=null;
    }

    @When("the user doesn't enter an email address")
    public void the_user_doesn_t_enter_an_email_address() {
        HomeLoginPage homeLoginPage=new HomeLoginPage();
        homeLoginPage.username.sendKeys("");
        homeLoginPage=null;
    }

    @When("the user doesn't enter a password")
    public void the_user_doesn_t_enter_a_password() {
        HomeLoginPage homeLoginPage=new HomeLoginPage();
        homeLoginPage.password.sendKeys("");
        homeLoginPage=null;
    }



}
