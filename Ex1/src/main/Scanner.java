package main;

// Controller
public class Scanner {

    CashRegister cashRegister;

    public Scanner(CashRegister cashRegister) {
        this.cashRegister = cashRegister;
    }
    public void scannedUPCCode(String UPCCode) {
        // Captures the UPC code read by the scanner.
        this.cashRegister.setCurrentProductUPC(UPCCode);
    }
    
}
