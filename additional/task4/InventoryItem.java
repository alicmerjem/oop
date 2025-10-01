package additional.task4;
import java.util.*;

interface Product {
    String displayDetails();
}

public abstract class InventoryItem implements Product {
    private String productName;
    private double price;
    private int quantity;

    public InventoryItem(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() { return productName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setProductName(String productName) { this.productName = productName; }
    public void setPrice(int price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public abstract String displayDetails();
}

class ElectronicsProduct extends InventoryItem {
    private String brand;

    public ElectronicsProduct(String productName, double price, int quantity, String brand) {
        super(productName, price, quantity);
        this.brand = brand;
    }

    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String displayDetails() {
        return "ElectronicsProduct: " + getProductName() + ", Brand: " + brand + ", Price: " + getPrice() + ", Quantity: " + getQuantity();
    }
}

class ClothingProduct extends InventoryItem {

    public ClothingProduct(String productName, double price, int quantity) {
        super(productName, price, quantity);
    }

    @Override
    public String displayDetails() {
        return "ClothingProduct: " + getProductName() + ", Price: " + getPrice() + ", Quantity: " + getQuantity();
    }
}

class InventoryManager {

    public List<InventoryItem> updateInventory(List<InventoryItem> items) {
        for (InventoryItem item : items) {
            // Check the type of product and apply discount
            if (item instanceof ElectronicsProduct) {
                ElectronicsProduct ep = (ElectronicsProduct) item; // downcasting
                ep.setPrice(ep.getPrice() * 0.9); // 10% discount
            } else if (item instanceof ClothingProduct) {
                ClothingProduct cp = (ClothingProduct) item; // downcasting
                cp.setPrice(cp.getPrice() * 0.8); // 20% discount
            }
        }
        return items;
    }
}



