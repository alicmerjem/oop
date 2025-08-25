package week8.additional;

public class Calculator<N extends Number> {
    public double square(N number) {
        return number.doubleValue() * number.doubleValue();
    }
}

// when you want to restrict generic to numberic types
