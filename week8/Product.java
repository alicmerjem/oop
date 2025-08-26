package week8;

public class Product<T extends Comparable<T>> {
    private String name;
    private T price;
    
    public Product(String name, T price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public T getPrice() {
        return price;
    }

    public String comparePrice(Product<T> other) {
        int comparison = this.price.compareTo(other.price);

        if (comparison > 0) {
            return "Product " + this.name + " is more expensive than " + other.name;
        } else if (comparison < 0) {
            return "Product " + this.name + " is cheaper than " + other.name;
        } else {
            return "Product " + this.name + " and " + other.name + " have the same price";
        }
    }
}

class Main {
    public static void main(String[] args) {
        Product<Double> p1 = new Product<>("Laptop", 1200.00);
        Product<Double> p2 = new Product<>("Tablet", 850.00);

        System.out.println(p1.comparePrice(p2));
    }
}
