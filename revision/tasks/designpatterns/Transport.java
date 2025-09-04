package revision.tasks.designpatterns;

public interface Transport {
    void deliver();
}

class Truck implements Transport {
    public void deliver() {
        System.out.println("delivering by land in a truck");
    }
}

class Ship implements Transport {
    public void deliver() {
        System.out.println("delivering by sea in a ship");
    }
}

class TransportFactory {
    public static Transport createTransport(String type) {
        if("truck".equalsIgnoreCase(type)) {
            return new Truck();
        } else if ("ship".equalsIgnoreCase(type)) {
            return new Ship();
        }

        throw new IllegalArgumentException("unknown transport type");
    }
}

class Main {
    public static void main(String[] args) {
        Transport truck = TransportFactory.createTransport("truck");
        truck.deliver();

        Transport ship = TransportFactory.createTransport("ship");
        ship.deliver();
    }
}