package com.cybertek.pages;

import com.longhorn.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Vendor {
    public Vendor(){
            PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton_Vendor;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchTab_Vendor;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement listIcon_Vendor;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton_Vendor;

    @FindBy(xpath = "//label[@class='btn btn-primary']")
    public WebElement loadButton_Vendor;
    
    @FindBy(xpath = "//div[@class='o_stat_info o_field_widget']/span[@class='o_stat_text o_not_hover text-success']")
    public WebElement archiveButton_Vendor;
    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[1]")
   
    public WebElement filterButton_Vendor;

    @FindBy(xpath = "(//ul[@class='dropdown-menu o_filters_menu'])//li[17]/a")
    public WebElement archivedButton_Vendor;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement nameVandor;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement create1;

    @FindBy(xpath = "//td//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement nameContact;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-primary'])[1]")
    public WebElement saveAndClose;

    @FindBy(xpath = "//div/button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement save;

    @FindBy(xpath = "//div[@class='o_thread_message_content']")
    public WebElement vendorCreatedMessage;



    @FindBy(xpath = "//div[@class='o_kanban_view o_res_partner_kanban o_kanban_ungrouped']")
    public WebElement listOfAllVendors;

    @FindBy(xpath = "((//div[@class='oe_kanban_details']//strong)/span)")
    public List<WebElement> vendorNameListElements;

    @FindBy(xpath = "//label[@class='btn btn-primary']")
    public WebElement loadFile;

    
 
    


}
