package week7;
import java.util.*;

abstract class Shape {
    private String color;
    
    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

                shapes.add(new Circle("Red", 5.0));
        shapes.add(new Rectangle("Blue", 4.0, 6.0));
        shapes.add(new Circle("Green", 3.0));
        shapes.add(new Rectangle("Yellow", 2.5, 5.5));

        for (Shape s : shapes) {
            System.out.println(s.getColor());
            System.out.println(s.getArea());
        }
    }
}