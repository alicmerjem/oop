package week13.threads;

public class LifecycleThread extends Thread {
    @Override
    public void run() {
        System.out.println("thread is running");
    }
}

class ThreadLifecycleExample {
    public static void main(String[] args) {
        LifecycleThread t = new LifecycleThread();
        System.out.println("thread state" + t.getState());

        t.start();
        System.out.println("thread state after start" + t.getState());

        try {
            t.join(); // wait for thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}