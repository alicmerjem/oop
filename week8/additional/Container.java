package week8.additional;

public interface Container<T> {
    T getValue();
    void setValue(T value);
}

// T is a placeholder for whatever type
// the implementing class wants to use

// ant class implementing this interface must specify the type