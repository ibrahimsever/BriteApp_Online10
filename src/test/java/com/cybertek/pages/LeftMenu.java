package com.cybertek.pages;

import com.longhorn.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftMenu {

    public LeftMenu() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//li[@class='active'])[3]")
    public WebElement linkPurchasePage;


    @FindBy(xpath = "//a[@data-menu='519']")
    public WebElement linkPurchaseOrders;

    @FindBy(xpath = "//a[@data-menu='506']")
    public WebElement linkVendors;

    @FindBy(xpath = "//a[@data-menu='516']")
    public WebElement linkProducts;


    @FindBy(xpath = "//a[@data-menu='514']")
    public WebElement linkIncomingProducts;


    @FindBy(xpath = "//a[@data-menu='515']")
    public WebElement linkVendorBills;


    @FindBy(xpath = "//a[@data-menu='695']")
    public WebElement linkRequestForQoutation;

}
