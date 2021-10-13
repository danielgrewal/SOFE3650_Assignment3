package main;

// View
public class Display implements IView {

    public void displayText(String text) {
        // Displays some text on the screen.
        GUI.setDisplay(text);
    }

    @Override
    public void displayProduct(Product product) {
        this.displayText(product.name + " $" + product.price);
    }
}
