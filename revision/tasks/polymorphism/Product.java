package revision.tasks.polymorphism;

public class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getInfo() {
        return "some info to be returned";
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
        return super.getInfo() + "blablabla" + author;
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
        return super.getInfo() + " (Warranty: " + warrantyMonths + " months)";
    }
}

// Subclass: ClothingProduct
class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " (Size: " + size + ")";
    }
}