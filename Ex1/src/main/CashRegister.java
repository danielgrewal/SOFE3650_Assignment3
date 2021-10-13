package main;

import java.util.ArrayList;

// Model
public class CashRegister {

    private Product product;
    private ArrayList<String> scannedProducts;
    private ProductDB productDB;
    private Display display;
    private TicketPrinter ticketPrinter;

    public CashRegister() {
        this.scannedProducts = new ArrayList<String>();
        this.productDB = new ProductDB();
        this.display = new Display();
        this.ticketPrinter = new TicketPrinter();
    }

    public void setCurrentProductUPC(String UPCCode) {
        // Sets the UPC code for the current scanned product.  
        this.product = productDB.getProductInfo(UPCCode);
        String productString = getCurrentProductInfo().name + " $" + getCurrentProductInfo().price;
        display.displayText(productString);
        this.scannedProducts.add(productString);
        String ticketString = String.join("\n", scannedProducts);
        this.ticketPrinter.displayText(ticketString);
    }

    public Product getCurrentProductInfo() {
        // Gets the product information for the latest scanned product.
        return this.product;
    }
    
}
