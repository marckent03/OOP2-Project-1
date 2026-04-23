public class Potion extends Item {

    private int healAmount;

    public Potion(String name, int price, int healAmount) {
        super(name, price, "Potion");
        this.healAmount = healAmount;
    }

    public int getHealAmount() { return healAmount; }

    public void use(String playerName) {
        System.out.println(playerName + " used " + getName()
                + " and restored " + healAmount + " HP!");
    }
}