package main;

import java.util.ArrayList;

// Model
public class CashRegister {

    private Product product;
    private ArrayList<Product> scannedProducts;
    private ProductDB productDB;
    private Display display;
    private TicketPrinter ticketPrinter;

    public CashRegister() {
        this.productDB = new ProductDB();
        this.display = new Display();
        this.ticketPrinter = new TicketPrinter();
    }

    public void setCurrentProductUPC(String UPCCode) {
        // Sets the UPC code for the current scanned product.  
        this.product = productDB.getProductInfo(UPCCode);
        display.displayText(getCurrentProductInfo().name + " $" + getCurrentProductInfo().price);
    }

    public Product getCurrentProductInfo() {
        // Gets the product information for the latest scanned product.
        return this.product;
    }
    
}
