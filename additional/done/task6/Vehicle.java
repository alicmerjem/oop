package additional.done.task6;

public class Vehicle {
    private final String model;
    private final Integer year; // use Integer so it can be null if not set
    private final Boolean isElectric;

    private Vehicle(VehicleBuilder builder) {
        this.model = builder.model;
        this.year = builder.year;
        this.isElectric = builder.isElectric;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public Boolean getIsElectric() {
        return isElectric;
    }

    // Builder class
    public static class VehicleBuilder {
        private final String model; // mandatory
        private Integer year;
        private Boolean isElectric;

        public VehicleBuilder(String model) {
            this.model = model;
        }

        public VehicleBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public VehicleBuilder setIsElectric(boolean isElectric) {
            this.isElectric = isElectric;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }

    // Example usage
    public static void main(String[] args) {
        Vehicle tesla = new Vehicle.VehicleBuilder("Tesla Model 3")
                .setYear(2022)
                .setIsElectric(true)
                .build();

        Vehicle ford = new Vehicle.VehicleBuilder("Ford Mustang").build();

        System.out.println(tesla.getModel() + ", " + tesla.getYear() + ", " + tesla.getIsElectric());
        System.out.println(ford.getModel() + ", " + ford.getYear() + ", " + ford.getIsElectric());
    }
}

