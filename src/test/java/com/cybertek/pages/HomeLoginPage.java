package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLoginPage {


        public HomeLoginPage()  {
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(linkText = "home")
        public WebElement homeButton;

        //1
        @FindBy(xpath = "(//a[@class='list-group-item'])[2]")
        public WebElement demoButton;

        @FindBy(id="login")
        public WebElement username;

        @FindBy(id = "password")
        public WebElement password;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement loginButton;

        @FindBy(id="db")
        public WebElement selectedDatabase;

        @FindBy(xpath = "//p[@class='alert alert-danger']")
        public WebElement wrongCredentials;

        public void login(String user,String pass){
            username.sendKeys(user);
            password.sendKeys(pass);
            loginButton.click();
        }

        //after logout login button
        @FindBy(xpath = "//a[@class='btn btn-default']")
        public WebElement selectLoginOption;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement submitAgain;

        @FindBy(linkText = "Sign in")
        public WebElement signInButtonAgain;


        @FindBy(id="password")
        public WebElement passwordAgain;


        public void open(){
            Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        }

        public void singInAgain(){
                demoButton.click();
                demoButton.click();
                login(ConfigurationReader.getProperty("username"),
                        ConfigurationReader.getProperty("password"));
        }






}
