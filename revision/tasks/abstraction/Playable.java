package revision.tasks.abstraction;

interface Playable {
    void play();
}

// Guitar class
class Guitar implements Playable {
    private String brand;

    public Guitar(String brand) {
        this.brand = brand;
    }

    @Override
    public void play() {
        System.out.println("Strumming the guitar!");
    }

    public String getBrand() {
        return brand;
    }
}

// Piano class
class Piano implements Playable {
    private String brand;

    public Piano(String brand) {
        this.brand = brand;
    }

    @Override
    public void play() {
        System.out.println("Playing the piano!");
    }

    public String getBrand() {
        return brand;
    }
}

// Drum class
class Drum implements Playable {
    private String brand;

    public Drum(String brand) {
        this.brand = brand;
    }

    @Override
    public void play() {
        System.out.println("Beating the drums!");
    }

    public String getBrand() {
        return brand;
    }
}

class Main {
    public static void main(String[] args) {
        Playable[] instruments = new Playable[3];
        instruments[0] = new Guitar("Fender");
        instruments[1] = new Piano("Yamaha");
        instruments[2] = new Drum("Pearl");

        for (Playable p : instruments) {
            p.play(); // Dynamic method dispatch

            // Use casting to call getBrand()
            if (p instanceof Guitar) {
                System.out.println("Brand: " + ((Guitar) p).getBrand());
            } else if (p instanceof Piano) {
                System.out.println("Brand: " + ((Piano) p).getBrand());
            } else if (p instanceof Drum) {
                System.out.println("Brand: " + ((Drum) p).getBrand());
            }

            System.out.println(); // Spacing
        }
    }
}
