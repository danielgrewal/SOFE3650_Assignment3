package main;

import java.util.HashMap;

public class ProductDB {

    HashMap<String, Product> productMap;

    public ProductDB() {
        this.productMap = new HashMap<>();
        this.productMap.put("1", new Product("1", "Milk", 5.99f));
        this.productMap.put("2", new Product("2", "Eggs", 2.99f));
        this.productMap.put("3", new Product("3", "White Bread", 2.57f));
        this.productMap.put("4", new Product("4", "Rice", 9.97f));
        this.productMap.put("5", new Product("5", "Strawberries", 3.97f));
        this.productMap.put("6", new Product("6", "Grapes", 5.45f));
    }

    public Product getProductInfo(String UPCCode) {
        // Gets the product information for the product with the UPC code equal to UPCCode.   
        return productMap.get(UPCCode);
    }
}
