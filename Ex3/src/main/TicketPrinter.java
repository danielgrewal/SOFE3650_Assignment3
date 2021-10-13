package main;

import java.util.ArrayList;

// View
public class TicketPrinter extends Observer {
    
    private ArrayList<String> scannedProducts;

    public TicketPrinter() {
        this.scannedProducts = new ArrayList<String>();
    }

    public void displayText(String text) {
        // Prints some text on the paper.
        GUI.setTicket(text);
    }

    @Override
    public void update(String productText) {
        this.scannedProducts.add(productText);
        String ticketString = String.join("\n", scannedProducts);
        this.displayText(ticketString);
    }
}
