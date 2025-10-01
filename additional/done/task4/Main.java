package additional.done.task4;
import java.util.*;

// Product interface
interface Product {
    String displayDetails();
}

// Abstract class InventoryItem
abstract class InventoryItem implements Product {
    private String productName;
    private double price;
    private int quantity;

    public InventoryItem(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// Concrete class ElectronicsProduct
class ElectronicsProduct extends InventoryItem {
    private String brand;

    public ElectronicsProduct(String productName, double price, int quantity, String brand) {
        super(productName, price, quantity);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String displayDetails() {
        return "ElectronicsProduct: " + getProductName() + ", Brand: " + brand +
               ", Price: " + getPrice() + ", Quantity: " + getQuantity();
    }
}

// Concrete class ClothingProduct
class ClothingProduct extends InventoryItem {
    public ClothingProduct(String productName, double price, int quantity) {
        super(productName, price, quantity);
    }

    @Override
    public String displayDetails() {
        return "ClothingProduct: " + getProductName() +
               ", Price: " + getPrice() + ", Quantity: " + getQuantity();
    }
}

// InventoryManager class
class InventoryManager {
    public List<InventoryItem> updateInventory(List<InventoryItem> items) {
        for (InventoryItem item : items) {
            if (item instanceof ElectronicsProduct) {
                ElectronicsProduct ep = (ElectronicsProduct) item; // downcasting
                double newPrice = ep.getPrice() * 0.9; // 10% discount
                ep.setPrice(newPrice);
            } else if (item instanceof ClothingProduct) {
                ClothingProduct cp = (ClothingProduct) item; // downcasting
                double newPrice = cp.getPrice() * 0.8; // 20% discount
                cp.setPrice(newPrice);
            }
        }
        return items;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        List<InventoryItem> items = new ArrayList<>();
        items.add(new ElectronicsProduct("Laptop", 1000.0, 5, "Dell"));
        items.add(new ClothingProduct("T-Shirt", 50.0, 20));

        InventoryManager manager = new InventoryManager();
        manager.updateInventory(items);

        for (InventoryItem item : items) {
            System.out.println(item.displayDetails());
        }
    }
}

