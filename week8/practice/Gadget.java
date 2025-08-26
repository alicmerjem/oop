package week8.practice;

public class Gadget<T extends Comparable<T>> {
    private String model;
    private T price;

    public Gadget(String model, T price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public T getPrice() {
        return price;
    }

    public String comparePrice(Gadget<T> other) {
        int result = this.price.compareTo(other.price);

        if(result > 0) {
            return model + " is more expensive than " + other.model;
        } else if (result < 0) {
            return model + " is cheaper than " + other.model;
        } else {
            return "both " + model + " and " + other.model + " have the same price";
        }
    }
}

class Main {
    public static void main(String[] args) {
        Gadget<Integer> g1 = new Gadget<>("Smartphone", 900);
        Gadget<Integer> g2 = new Gadget<>("Smartwatch", 400);

        System.out.println(g1.comparePrice(g2));
    }
}
