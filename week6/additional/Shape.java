package week6.additional;

public class Shape {
    public void draw() {
        System.out.println("drawing a shape");
    }
}

class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("drawing a circle");
    }

    int getRadius() {
        return radius;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("drawing a rectangle");
    }

    int getArea() {
        return width * height;
    }
}

class Main {
    public static void main(String[] args) {
        // upcasting 
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5); // upcast
        shapes[1] = new Rectangle(5, 6); // upcast

        for (Shape s : shapes) {
            s.draw();

            if (s instanceof Circle) {
                Circle c = (Circle) s;
                c.getRadius();
            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                r.getArea();
            }
        }
    }
}