package week8.practice;

public class SafeBox<T> {
    private int id;
    private boolean locked;
    private T content;

    public SafeBox(int id, boolean locked, T content) {
        this.id = id;
        this.locked = locked;
        this.content = content;
    }

    public void lock() {
        locked = true;
    }

    public void unlocked() {
        locked = false;
    }

    public void showContent() {
        if(locked) {
            System.out.println("safebox: " + id + " is locked. cannot view content.");
        } else {
            System.out.println("safebox " + id + " is unlocked. the content contains: " + content);
        }
    }
}

class Main {
    public static void main(String[] args) {
        SafeBox<String> sb = new SafeBox<>(101, true, "important docs");

        sb.showContent();

        sb.unlocked();

        sb.showContent();

        sb.lock();
    }
}