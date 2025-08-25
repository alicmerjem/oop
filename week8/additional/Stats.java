package week8.additional;

public class Stats<N extends Number> {
    private N[] numbers;

    public Stats(N[] numbers) {
        this.numbers = numbers;
    }

    public double average() {
        double sum = 0;

        for(N n : numbers) {
            sum += n.doubleValue(); // we must convert
        }
        
        return sum / numbers.length;
    }
}
