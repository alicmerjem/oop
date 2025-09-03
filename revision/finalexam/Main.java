package revision.finalexam;

// Base class
class Item {
    private String name;
    private int price;

    // Constructor
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Default tax calculation
    public double calculateTax() {
        return 0.0;
    }
}

// Chocolate subclass
class Chocolate extends Item {
    private double cocoaPercentage;

    public Chocolate(String name, int price, double cocoaPercentage) {
        super(name, price);
        this.cocoaPercentage = cocoaPercentage;
    }

    public double getCocoaPercentage() {
        return cocoaPercentage;
    }

    public void setCocoaPercentage(double cocoaPercentage) {
        this.cocoaPercentage = cocoaPercentage;
    }

    // Override tax calculation
    @Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }
}

// Cigarettes subclass
class Cigarettes extends Item {
    private double nicotinePercentage;

    public Cigarettes(String name, int price, double nicotinePercentage) {
        super(name, price);
        this.nicotinePercentage = nicotinePercentage;
    }

    public double getNicotinePercentage() {
        return nicotinePercentage;
    }

    public void setNicotinePercentage(double nicotinePercentage) {
        this.nicotinePercentage = nicotinePercentage;
    }

    // Override tax calculation
    @Override
    public double calculateTax() {
        return getPrice() * 0.89;
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        Item chocolate = new Chocolate("Dark Chocolate", 100, 70);
        Item cigarettes = new Cigarettes("Marlboro", 200, 1.2);

        System.out.println(chocolate.getName() + " tax: " + chocolate.calculateTax());
        System.out.println(cigarettes.getName() + " tax: " + cigarettes.calculateTax());
    }
}

