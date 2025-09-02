package week13.threads;

public class SimpleThreadExample {
    public static void main(String[] args) {
        System.out.println("main thread starts");

        Thread thread = new Thread(() -> {
            System.out.println("this is a separate thread running");
        });

        thread.start();

        System.out.println("main thread ends");
    }
}
