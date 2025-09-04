package revision.tasks.generics;

public class Product<T extends Comparable<T>> {
    private String name;
    private T price;

    public Product(String name, T price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public T getPrice() { return price; }

    public String comparePrice(Product<T> other) {
        int result = this.price.compareTo(other.getPrice());

        if (result > 0) {
            return "product" + this.name + " is more expensive than " + other.getName();
        } else if (result < 0) {
            return "product " + this.name + " is cheaper than " + other.getName();
        } else {
            return "both products cost the same";
        }
    }
}

class Main {
    public static void main(String[] args) {
        Product<Double> p1 = new Product<>("laptop", 1200.00);
        Product<Double> p2 = new Product<>("tablet", 750.00);

        p1.comparePrice(p2);
    }
}