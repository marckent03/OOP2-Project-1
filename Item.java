public class Item {
    private String name;
    private int price;
    private String type;

    public Item(String name, int price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName()  { return name; }
    public int getPrice()    { return price; }
    public String getType()  { return type; }

    @Override
    public String toString() {
        return "[" + type + "] " + name + " - " + price + " gold";
    }
}