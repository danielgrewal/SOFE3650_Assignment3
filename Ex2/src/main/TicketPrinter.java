package main;

import java.util.ArrayList;

// View
public class TicketPrinter implements IView {
    
    private ArrayList<String> scannedProducts;

    public TicketPrinter() {
        this.scannedProducts = new ArrayList<String>();
    }

    public void displayText(String text) {
        // Prints some text on the paper.
        GUI.setTicket(text);
    }

    @Override
    public void displayProduct(Product product) {
        this.scannedProducts.add(product.name + " $" + product.price);
        String ticketString = String.join("\n", scannedProducts);
        this.displayText(ticketString);
    }
}
