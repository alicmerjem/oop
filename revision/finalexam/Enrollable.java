package revision.finalexam;
import java.util.*;

interface Enrollable {
    void enroll();
}

interface Payment {
    void makePayment(String date, double amount);
}

class Students implements Enrollable, Payment {
    private HashMap<String, Double> payments;

    public Students() {
        this.payments = new HashMap<>();
    }

    @Override
    public void enroll() {
        System.out.println("enrolled in a course");
    }


    @Override
    public void makePayment(String date, double amount) {
        // if a payment already exists for the date, add to it
        payments.put(date, payments.getOrDefault(date, 0.0) + amount);
    }

    public double getPayment(String date) {
        return payments.getOrDefault(date, 0.0);
    }

    public static void main(String[] args) {
        Students student = new Students();
        student.enroll();
    }
}