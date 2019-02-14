package com.cybertek.pages;

import com.longhorn.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenu {
    public TopMenu() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(partialLinkText = "Purchases")
    public WebElement purchaseLink;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement nameOfUser;

    @FindBy(linkText = "Log out")
    public WebElement logOut;
}
