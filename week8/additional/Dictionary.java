package week8.additional;

public class Dictionary<K, V> {
    private K key;
    private V value;

    public Dictionary(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public String pair() {
        return key + " = " + value;
    }
}
