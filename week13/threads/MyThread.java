package week13.threads;

public class MyThread extends Thread{ 
    @Override
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println("thread counting " + i);
        }
    }
}
class ThreadClassExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        System.out.println("main thread continues");
    }
}
