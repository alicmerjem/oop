package week9.tasks;

public record Record1(int x, int y) { }

class Main {
    public static void main(String[] args) {
        Record1 p1 = new Record1(5, 10);

        System.out.println("x coordinate " + p1.x());
        System.out.println("y coordinate: " + p1.y());
    }
}
