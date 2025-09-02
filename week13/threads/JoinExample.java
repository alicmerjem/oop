package week13.threads;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 3; i++) {
                System.out.println("thread 1: " + i);
            }
        });

        t1.setPriority(Thread.MIN_PRIORITY);

        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 3; i++) {
                System.out.println("thread 2: " + i);
            }
        });

        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t1.join(); // main thread waits until t1 finishes

        t2.start(); // runs after t1 is done
    }
}
