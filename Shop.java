import java.util.ArrayList;

public class Shop {

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void showItems() {
        System.out.println("\n--- Shop ---");
        for (Item item : items) {
            System.out.println("- " + item);
        }
    }

    public Item buy(int index) {
        if (index < 0 || index >= items.size()) return null;
        return items.remove(index);
    }
}