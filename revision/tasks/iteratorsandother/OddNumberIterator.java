package revision.tasks.iteratorsandother;
import java.util.*;

public class OddNumberIterator implements Iterator<Integer>{
    private int[] numbers;
    private int index = 0;

    public OddNumberIterator(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean hasNext() {
        while(index < numbers.length && numbers[index] % 2 == 0) {
            index++;
        }
        return index < numbers.length;
    }

    @Override
    public Integer next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }
        return numbers[index++];
    }
}

class Main {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7};

        OddNumberIterator iterator = new OddNumberIterator(data);

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
