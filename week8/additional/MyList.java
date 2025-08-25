package week8.additional;

public class MyList<E> {
    private E[] elements;

    public MyList(E[] elements) {
        this.elements = elements;
    }

    public E get(int index) {
        return elements[index];
    }
}

// this is usually used with lists, sets, arrays
