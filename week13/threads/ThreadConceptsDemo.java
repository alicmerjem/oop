package week13.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Shared Counter for synchronization demo
class Counter {
    private int count = 0;

    // Synchronized method to prevent race conditions
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class ThreadConceptsDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== THREAD BASICS & RUNNABLE ===");
        // Thread using Thread class
        Thread t1 = new Thread() {
            public void run() {
                System.out.println("Thread t1 running");
            }
        };
        t1.start();

        // Thread using Runnable interface
        Thread t2 = new Thread(() -> System.out.println("Runnable thread t2 running"));
        t2.start();

        t1.join(); // wait for t1 to finish
        t2.join(); // wait for t2 to finish

        System.out.println("\n=== SLEEP DEMO ===");
        Thread sleeper = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Sleeping thread: " + i);
                try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });
        sleeper.start();
        sleeper.join();

        System.out.println("\n=== SYNCHRONIZATION / RACE CONDITION ===");
        Counter counter = new Counter();
        Thread r1 = new Thread(() -> { for (int i = 0; i < 1000; i++) counter.increment(); });
        Thread r2 = new Thread(() -> { for (int i = 0; i < 1000; i++) counter.increment(); });
        r1.start(); r2.start();
        r1.join(); r2.join();
        System.out.println("Final Counter: " + counter.getCount()); // Should always be 2000

        System.out.println("\n=== THREAD PRIORITIES ===");
        Thread low = new Thread(() -> System.out.println("Low priority thread running"));
        Thread high = new Thread(() -> System.out.println("High priority thread running"));
        low.setPriority(Thread.MIN_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);
        low.start(); high.start();
        low.join(); high.join();

        System.out.println("\n=== DAEMON THREAD ===");
        Thread daemon = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Daemon thread running " + i);
                try { Thread.sleep(300); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });
        daemon.setDaemon(true); // JVM will exit even if daemon is running
        daemon.start();
        Thread.sleep(1000); // main thread sleeps briefly

        System.out.println("\n=== THREAD POOL / EXECUTORS ===");
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.submit(() -> System.out.println("Thread pool task " + taskId + " running"));
        }
        executor.shutdown(); // stop accepting new tasks
    }
}

