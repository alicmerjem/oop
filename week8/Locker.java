package week8;

public class Locker<T> {
    private int lockerNumber;
    private boolean isLocked;
    private T item;
    
    public Locker(int lockerNumber, T item) {
        this.lockerNumber = lockerNumber;
        this.item = item;
        this.isLocked = true;
    }

    public void unlock() {
        isLocked = false;
        System.out.println("the lock " + lockerNumber + " is now unlocked");
    }

    public void lock() {
        isLocked = true;
        System.out.println("the locker " + lockerNumber + " is now locked");
    }

    public void viewItem() {
        if (!isLocked) {
            System.out.println("locker " + lockerNumber + " contains " + item);
        } else {
            System.out.println("locker " + lockerNumber + " is locked. you cannot view the contents of the locker.");
        }
    }
}

class Main {
    public static void main (String[] args) {
        // locker for storing a string
        Locker<String> bookLocker = new Locker<>(101, "Harry Potter");

        // locker for storing an integer
        Locker<Integer> numberLocker = new Locker<>(202, 12345);

        // try to view while locked
        bookLocker.viewItem();
        numberLocker.viewItem();

        // unlock and view
        bookLocker.unlock();
        bookLocker.viewItem();

        // lock again
        bookLocker.lock();
        bookLocker.viewItem();
    }
}
