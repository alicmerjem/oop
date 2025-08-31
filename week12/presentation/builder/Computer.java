package week12.presentation.builder;

public class Computer {
    private String cpu;
    private String ram;
    private int storage;
    private String graphicsCard;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    static class Builder {
        private String cpu;
        private String ram;
        private int storage;
        private String graphicsCard;

        public Builder(String cpu) {
            this.cpu = cpu;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer.Builder("amd ryzen")
            .build();

        System.out.println(c1);

    }
}
