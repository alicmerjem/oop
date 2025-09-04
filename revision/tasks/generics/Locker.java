package revision.tasks.generics;
import java.util.*;

public class Locker<T> {
    private int lockerNumber;
    private boolean isLocked;
    private T item;

    public Locker(int lockerNumber, T item) {
        this.lockerNumber = lockerNumber;
        this.item = item;
        this.isLocked = true;
    }

    public void lock() {
        isLocked = true;
        System.out.println("locker " + lockerNumber + " is now locked");
    }

    public void unlock() {
        isLocked = false;
        System.out.println("Locker " + lockerNumber + " is now unlocked.");
    }
    

    public void viewItem() {
        if(!isLocked) {
            System.out.println("locker " + lockerNumber + " contains: " + item);
        } else {
            System.out.println("locker is locked. access denied");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Locker<String> locker1 = new Locker<>(101, "math textbook");
        Locker<Integer> locker2 = new Locker<>(102, 500);

        ArrayList<Locker<?>> lockers = new ArrayList<>();
        lockers.add(locker1);
        lockers.add(locker2);

        // loop and test the lockers
        for(Locker<?> locker : lockers) {
            locker.viewItem();
            locker.unlock();
            locker.viewItem();
            locker.lock();
        }
    }
}