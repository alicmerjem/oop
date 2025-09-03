package revision.finalexam.additionalhashmap;
import java.util.*;;

interface Purchasable {
    void addItem(String item, int quantity);
}

class ShoppingList implements Purchasable {
    private HashMap<String, Integer> items;

    public ShoppingList() {
        this.items = new HashMap<>();
    }

    @Override
    public void addItem(String item, int quantity) {
        int existingQuantity = items.getOrDefault(item, 0);

        items.put(item, existingQuantity + quantity);
    }

    public int getQuantity(String item) {
        return items.getOrDefault(item, 0);
    }
}
