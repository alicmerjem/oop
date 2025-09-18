import java.util.*;

interface Drawable {
    void draw();
}

abstract class Shape implements Drawable {
    
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
        System.out.println("drawing circle");
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
        System.out.println("drawing square");
    }
}

class ShapeManager {
    public List<Drawable> drawAll(List<Drawable> shapes) {
        for(Drawable d : shapes) {
            if(d instanceof Circle) {
                Circle c = (Circle) d;
                c.setRadius(15);
            } else if (d instanceof Square) {
                Square s = (Square) d;
                s.setSideLength(5);
            }
            d.draw(); // call draw after modifying
        }
        return shapes;
    }
}

