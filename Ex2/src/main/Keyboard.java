package main;

// Controller
public class Keyboard {
    
    CashRegister cashRegister;

    public Keyboard(CashRegister cashRegister) {
        this.cashRegister = cashRegister;
    }

    public void setUPCCode(String UPCCode) {
        // Saves the UPC code entered by cashier
        this.cashRegister.setCurrentProductUPC(UPCCode);
    }
}
