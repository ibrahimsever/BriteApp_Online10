package com.cybertek.utilities;


import com.cybertek.pages.*;

public class Pages {
    private HomeLoginPage homeLoginPage;
    private TopMenu topMenu;
    private LeftMenu leftMenu;
    private RequestsForQuotation requestsForQuotation;
    private PurchaseOrder purchaseOrder;
    private Vendor vendor;
    private IncomingProduct incomingProduct;
    private Products products;
    private VendorBills vendorBills;


    public HomeLoginPage loginPage() {
        if (homeLoginPage == null) {
            homeLoginPage = new HomeLoginPage();
        }
        return homeLoginPage;
    }

    public Vendor vendor() {
        if (vendor==null){
            vendor=new Vendor();
        }
        return vendor;
    }

    public TopMenu topMenu() {
        if (topMenu == null) {
            topMenu = new TopMenu();
        }
        return topMenu;
    }

    public LeftMenu leftMenu() {
        if (leftMenu == null) {
            leftMenu = new LeftMenu();
        }
        return leftMenu;
    }

    public RequestsForQuotation requestsForQuotation() {
        if (requestsForQuotation == null) {
            requestsForQuotation = new RequestsForQuotation();
        }
        return requestsForQuotation;
    }

    public PurchaseOrder purchaseOrder(){
        if (purchaseOrder == null) {
            purchaseOrder = new PurchaseOrder();
        }
        return purchaseOrder;
    }

    public IncomingProduct incomingProduct(){
        if (incomingProduct == null) {
            incomingProduct = new IncomingProduct();
        }
        return incomingProduct;
    }

    public Products products(){
        if (products == null) {
            products = new Products();
        }
        return products;
    }

    public VendorBills vendorBills(){
        if (vendorBills == null) {
            vendorBills = new VendorBills();
        }
        return vendorBills;
    }


}
