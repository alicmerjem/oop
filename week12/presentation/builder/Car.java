package week12.presentation.builder;

public class Car {
    private String model;
    private String color;
    private String engine;
    private boolean sunroof;

    private Car(Builder builder) {
        this.model = builder.model;
        this.color = builder.model;
        this.engine = builder.engine;
        this.sunroof = builder.sunroof;
    }

    static class Builder {
        private String model;
        private String color;
        private String engine;
        private boolean sunroof;

        public Builder(String model) {
            this.model = model;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

        @Override
        public String toString() {
            return model + " color: " + color + " engine: " + engine + " sunroof: " + sunroof;
        }
    }
}

class Main{
    public static void main(String[] args) {
        Car car = new Car.Builder("porsche gt3 rs")
            .setColor("red")
            .build();

        System.out.println(car);
    }
}
