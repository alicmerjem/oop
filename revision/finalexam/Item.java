package revision.finalexam;
import java.util.*;

public class Item {
    private int barcode;
    private String name;

    public Item(int barcode, String name) {
        this.barcode = barcode;
        this.name = name;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Milk extends Item {
    public Milk(int barcode, String name) {
        super(barcode, name);
    }
}

class Honey extends Item {
    public Honey(int barcode, String name) {
        super(barcode, name);
    }
}

class Order<T extends Item> {
    private List<T> item;

    public Order(List<T> item) {
        this.item = item;
    }

    public List<T> getItem() {
        return item;
    }

    public void setItem(List<T> item) {
        this.item = item;
    }

    // filter items by name
    public List<T> filterByName(String name) {
        List<T> filtered = new ArrayList<>();

        for(T i : item) {
            if(i.getName().equals(name)) {
                filtered.add(i);
            }
        }
        return filtered;
    }

    // method to get item by barcode
    public T getByBarcode(int barcode) {
        for(T i : item) {
            if(i.getBarcode() == barcode) {
                return i;
            }
        }
        return null;
    }
}
