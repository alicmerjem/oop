package week6;
import java.util.*;

public class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getInfo() {
        return name + " -$ " + price; 
    }
}

class BookProduct extends Product {
    private String author;

    public BookProduct(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Author: " + author;
    }
}

class ElectronicsProduct extends Product {
    private int warrantyMonths;

    public ElectronicsProduct(String name, double price, int warrantyMonths) {
        super(name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Warranty: " + warrantyMonths + " months";
    }
}

class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Size: " + size;
    }
}

class ProductDemo {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        // Add mix of products
        products.add(new BookProduct("1984", 15.99, "George Orwell"));
        products.add(new ElectronicsProduct("Laptop", 999.99, 24));
        products.add(new ClothingProduct("T-shirt", 19.99, "M"));
        products.add(new BookProduct("Brave New World", 12.99, "Aldous Huxley"));
        products.add(new ElectronicsProduct("Smartphone", 799.99, 12));
        products.add(new ClothingProduct("Jeans", 49.99, "L"));

        // Loop and print info (dynamic dispatch)
        for (Product p : products) {
            System.out.println(p.getInfo());
        }
    }
}