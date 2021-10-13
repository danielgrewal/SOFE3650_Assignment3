package main;



// Model
public class CashRegister {

    private Product product;
    
    private ProductDB productDB;
    private Display display;
    private TicketPrinter ticketPrinter;

    public CashRegister(IView display, IView ticketPrinter) {
        
        this.productDB = new ProductDB();
        this.display = (Display)display;
        this.ticketPrinter = (TicketPrinter)ticketPrinter;
    }

    public void setCurrentProductUPC(String UPCCode) {
        // Sets the UPC code for the current scanned product.  
        this.product = productDB.getProductInfo(UPCCode);
        this.display.displayProduct(this.product);
        this.ticketPrinter.displayProduct(this.product);
    }

    public Product getCurrentProductInfo() {
        // Gets the product information for the latest scanned product.
        return this.product;
    }
    
}
