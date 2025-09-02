package week13.threads;

public class SleepExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Sleeping thread: " + i);
                    Thread.sleep(1000); // 1 second
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        });

        thread.start();
    }
}
