package week11.labs;
import java.util.*;

class OddNumberIterator implements Iterator<Integer> {
    private int[] numbers;
    private int index;

    public OddNumberIterator(int[] numbers) {
        this.numbers = numbers;
        this.index = 0;
        moveToNextOdd();
    }

    private void moveToNextOdd() {
        while (index < numbers.length && numbers[index] % 2 == 0) {
            index++;
        }
    }

    @Override
    public boolean hasNext() {
        return index < numbers.length;
    }

    @Override
    public Integer next() {
        if(!hasNext()) throw new NoSuchElementException();

        int value = numbers[index];
        index++;

        moveToNextOdd();
        return value;
    }
}

public class OddNumberIteratorTest {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7};

        OddNumberIterator it = new OddNumberIterator(data);

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
