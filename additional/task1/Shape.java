package additional.task1;
import java.util.*;

interface Drawable {
    void draw();
}

public abstract class Shape implements Drawable {
    
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("drawing a circle");
    }
}

class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.println("drawing a square");
    }
}

class ShapeMananger {
    public List<Drawable> drawAll(List<Drawable> shapes) {
        for(Drawable shape : shapes) {
            if(shape instanceof Circle) {
                Circle circle = (Circle) shape;
                circle.setRadius(5);
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                square.setSideLength(12); 
            }
            shape.draw();
        }
        return shapes;
    }
}