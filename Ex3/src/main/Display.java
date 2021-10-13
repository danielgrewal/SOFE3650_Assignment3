package main;

// View
public class Display extends Observer {

    public void displayText(String text) {
        // Displays some text on the screen.
        GUI.setDisplay(text);
    }

    @Override
    public void update(String productText) {
        this.displayText(productText);
        
    }
}
