package com.cybertek.pages;

import com.longhorn.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PurchaseOrder {

    public PurchaseOrder (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//ol[@class='breadcrumb']/li")
    public WebElement headerPurchaseOrder;

    @FindBy(xpath = "(//table//tr)[1]/th[3]")
    public WebElement datePurchaseOrder;

    @FindBy(xpath = "(//table//tr)[1]/th[3]")
    public WebElement referencePurchaseOrder;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createPurchaseOrder;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement savePurchaseOrder;

    @FindBy(xpath = "(//a[@data-toggle='tab'])[2]")
    public WebElement deliveriesInvoices;

    @FindBy(xpath = "")
    public WebElement editPurchaseOrder;



}
