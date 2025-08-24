package week7;

interface Playable {
    void play();
}

class Guitar implements Playable {
    private String brand;

    public Guitar(String brand) {
        this.brand = brand;
    }

    public void play() {
        System.out.println("playing a guitar");
    }

    public String getBrand() {
        return brand;
    }
}

class Piano implements Playable {
    private String brand;
    
    public Piano(String brand) {
        this.brand = brand;
    }

    public void play() {
        System.out.println("playing a piano");
    }

    public String getBrand() {
        return brand;
    }
}

class Drum implements Playable {
    private String brand;

    public Drum(String brand) {
        this.brand = brand;
    }

    public void play() {
        System.out.println("playing a drum");
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
            p.play();

            if(p instanceof Guitar) {
                Guitar g = (Guitar) p;
                g.getBrand();
            } else if(p instanceof Piano) {
                Piano pi = (Piano) p;
                pi.getBrand();
            } else if (p instanceof Drum) {
                Drum d = (Drum) p;
                d.getBrand();
            }
        }
    }
}