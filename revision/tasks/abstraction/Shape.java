package revision.tasks.abstraction;
import java.util.*;

abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea(); // Abstract method

    public String getColor() { // Concrete method
        return color;
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Red", 5));
        shapes.add(new Rectangle("Blue", 4, 6));
        shapes.add(new Circle("Green", 3));
        shapes.add(new Rectangle("Yellow", 2, 8));

        for (Shape s : shapes) {
            System.out.println("Shape color: " + s.getColor());
            System.out.println("Shape area: " + s.getArea());
            System.out.println(); // spacing
        }
    }    
}
