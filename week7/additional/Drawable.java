package week7.additional;

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("drawing a circle");
    }
}

class Square implements Drawable {
    public void draw() {
        System.out.println("drawing a square");
    }
}

class Main {

    public static void render(Drawable d) {
        d.draw();
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();

        render(c);
        render(s);
    }
}