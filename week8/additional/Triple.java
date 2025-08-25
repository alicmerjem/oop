package week8.additional;

public class Triple<T, U, V> {
    private T first;
    private U second;
    private V third;

    public Triple(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void printAll() {
        System.out.println(first + ", " + second + ", " + third);
    }
}

// the letters are just convetions
// they could all be T
// but by writing K, V or E you know what its for
