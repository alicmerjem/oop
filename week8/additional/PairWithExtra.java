package week8.additional;

public class PairWithExtra<T, U, N extends Number> {
    private T first;
    private U second;
    private N id;

    public PairWithExtra(T first, U second, N id) {
        this.first = first;
        this.second = second;
        this.id = id;
    }

    public void print() {
        System.out.println(id + ", " + first + ", " + second);
    }
}
