package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestsForQuotation {

    public RequestsForQuotation() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//a[@data-menu='518']")
    public WebElement titlePurchaseOrders;


    @FindBy(xpath = "//a[@data-menu='504']")
    public WebElement requestForQuote;

    @FindBy(xpath = "//td[@title='Total amount']")
    public WebElement PurchasesTab;

    @FindBy(xpath = "//table//tbody//tr")
    public WebElement totalAmount;

    @FindBy(xpath = "(//div[@class='btn-group']//ul)[2]//li)[1]")
    public WebElement export;


    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createRfQ;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveRfQ;

    @FindBy(css = "h1")
    public WebElement titleCreateRFQ;


    @FindBy(className = "o_field_widget o_field_many2one o_required_modifier")
    public WebElement selectVendor;

    @FindBy(partialLinkText = "Deliveries & Invoices")
    public WebElement deliveriesInvoices;

    @FindBy(id = "o_field_input_34")
    public WebElement selectShheduleDate;



    public WebElement Quote(int num)
    {
        Driver.getDriver().findElement(By.xpath("//table//tbody//tr["+num+"]//td[1]")).click();
        return Driver.getDriver().findElement(By.xpath("//table//tbody//tr["+num+"]//td[7]"));

    }




}
