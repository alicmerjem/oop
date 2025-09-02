package week13.threads;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println("runnable thread counting " + i);
        }
    }
}

class RunnableThreadExample {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        System.out.println("new thread continues");
    }
}
