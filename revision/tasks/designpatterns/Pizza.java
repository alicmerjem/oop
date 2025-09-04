package revision.tasks.designpatterns;

public class Pizza {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;

    public String getSize() { return size; }
    public boolean getCheese() { return cheese; }
    public boolean getPepperoni() { return pepperoni; }
    public boolean getMushroom() { return mushrooms; }

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
    }

    public static class Builder {
        private String size;
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushrooms;

        public Builder(String size) {
            this.size = size;
        } 

        public Builder addCheese() {
            this.cheese = true;
            return this;
        }

        public Builder addPepperoni() {
            this.pepperoni = true;
            return this;
        }

        public Builder addMushrooms() {
            this.mushrooms = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Pizza za1 = new Pizza.Builder("large").addCheese().addPepperoni().build();
        Pizza za2 = new Pizza.Builder("medium").addCheese().addPepperoni().build();

        System.out.println(za1);
        System.out.println(za2);
    }
}