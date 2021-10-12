package main;

// Model
public class CashRegister {

    private String UPCCode;
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
        this.UPCCode = UPCCode;
    }

    public Product getCurrentProductInfo() {
        // Gets the product information for the latest scanned product.
        return productDB.getProductInfo(this.UPCCode);
    }
    
}
